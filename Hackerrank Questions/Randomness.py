# Enter your code here. Read input from STDIN. Print output to STDOUT

# v1

def substrings_1(S, N):

    return len({S[i:j+1] for i in range(0, N) for j in range(i, N)})


def main_1(substrings):

    N, Q = map(int, input().split())

    S = input()

    for _ in range(Q):

        P, C = input().split()

        P = int(P)

        S = S[:P-1] + C + S[P:]

        print(substrings(S, N))

# v2


def create_tree(S, N):

    root = [None] * 27

    for i in range(N):

        node = root

        j = i

        while isinstance(node[S[j]], list):

            node = node[S[j]]

            j += 1

        while node[S[j]] is not None:

            child = [None] * 27

            k = node[S[j]]

            child[S[k]] = k + 1

            node[S[j]] = child

            node = child

            j += 1

        node[S[j]] = j + 1

    return root


def node_repr(node):

    return '[%s]' % ' '.join(

        '%s:%s' % (

            '$' if i == 26 else chr(i + 97),

            node[i] if isinstance(node[i], int) else node_repr(node[i]))

        for i in range(27)

        if node[i] is not None)


def count(root, N):

    count = 0

    stack = [(root, 0)]

    while stack:

        node, i = stack.pop()

        if i == 26:

            continue

        if isinstance(node[i], list):

            stack.append((node, i + 1))

            stack.append((node[i], 0))

            count += 1

            continue

        if node[i] is not None:

            count += 1 + N - node[i]

        stack.append((node, i + 1))

    return count


def main_2():

    N, Q = map(int, input().split())

    S = bytearray(ord(c) - 97 for c in input())

    S.append(26)  # $

    for _ in range(Q):

        P, C = input().split()

        P = int(P)

        C = ord(C) - 97  # ord('a')

        S[P - 1] = C

        root = create_tree(S, N)

        # print(node_repr(root))

        print(count(root, N))


# v3

class SuffixNode:

    __slots__ = 'parent', 'suffix', 'depth'

    def __init__(self, parent, suffix):

        self.parent = parent

        self.suffix = suffix  # Int | List[SuffixNode]

        self.depth = 0 if parent is None else (parent.depth + 1)


def is_branch(node):

    return node is not None and isinstance(node.suffix, list)


def extend(node, S, N, j, segment_root):

    while is_branch(node.suffix[S[j]]):

        node = node.suffix[S[j]]

        j += 1

    removed = False

    while node.suffix[S[j]] is not None:

        child = SuffixNode(node, [None] * 27)

        leaf = node.suffix[S[j]]

        if not removed:

            remove(segment_root, leaf)

            removed = True

        node.suffix[S[j]] = child

        child.suffix[S[leaf.suffix]] = leaf

        leaf.suffix += 1

        leaf.parent = child

        leaf.depth = child.depth + 1

        node = child

        j += 1

    if removed:

        add(segment_root, leaf)

    node.suffix[S[j]] = SuffixNode(node, j + 1)

    add(segment_root, node.suffix[S[j]])

    return 1 + N - (j + 1)


def traverse(root):

    stack = [(root, 0)]

    while stack:

        node, i = stack.pop()

        if i == 26:

            continue

        if is_branch(node.suffix[i]):

            stack.append((node, i + 1))

            stack.append((node.suffix[i], 0))

            yield node.suffix[i]

            continue

        if node.suffix[i] is not None:

            yield node.suffix[i]

        stack.append((node, i + 1))


class SegmentNode1:

    __slots__ = 'a', 'b', 'nodes', 'children'

    def __init__(self, a, b):

        self.a, self.b = a, b  # [a, b[

        self.nodes = []

        self.children = []


class SegmentNode:  # 2-aligned

    __slots__ = 'a', 'b', 'nodes', 'left', 'right'

    def __init__(self, a, b):

        self.a, self.b = a, b  # [a, b[

        self.nodes = []

        self.left = None if a + 1 == b else SegmentNode(a, (a + b) // 2)

        self.right = None if a + 1 == b else SegmentNode((a + b) // 2, b)


def add1(root, node):

    b = node.suffix

    a = b - node.depth

    _add(root, node, a, b)


def _add1(root, node, a, b):

    root_a, root_b = root.a, root.b

    if a <= root_a and root_b <= b:

        root.nodes.append(node)

        return

    if b <= root_a or root_b <= a:

        return

    if not root.children and root_a + 1 < root_b:

        mid = (root_a + root_b) // 2

        root.children = [

            SegmentNode(root_a, mid),

            SegmentNode(mid, root_b)]

    for c in root.children:

        _add(c, node, a, b)


def remove1(root, node):

    b = node.suffix

    a = b - node.depth

    _remove(root, node, a, b)


def _remove1(root, node, a, b):

    root_a, root_b = root.a, root.b

    if a <= root_a and root_b <= b:

        root.nodes.remove(node)

        return

    if b <= root_a or root_b <= a:

        return

    for c in root.children:

        _remove(c, node, a, b)


def find1(root, n):

    assert root.a <= n < root.b

    while True:

        for node in root.nodes:

            yield node

        if not root.children:

            break

        root = root.children[(root.a + root.b) // 2 <= n]


def add(root, node):

    b = node.suffix

    a = b - node.depth

    b_xor_a = b ^ a

    mask = root.b // 2

    while not b_xor_a & mask:

        root = root.right if a & mask else root.left

        mask //= 2

    a_root, b_root = root.left, root.right

    mask //= 2

    while mask:

        if a & mask:

            a_root = a_root.right

        else:

            a_root.right.nodes.append(node)

            a_root = a_root.left

        if b & mask:

            b_root.left.nodes.append(node)

            b_root = b_root.right

        else:

            b_root = b_root.left

        mask //= 2

    a_root.nodes.append(node)


def remove(root, node):

    b = node.suffix

    a = b - node.depth

    b_xor_a = b ^ a

    mask = root.b // 2

    while not b_xor_a & mask:

        root = root.right if a & mask else root.left

        mask //= 2

    a_root, b_root = root.left, root.right

    mask //= 2

    while mask:

        if a & mask:

            a_root = a_root.right

        else:

            a_root.right.nodes.remove(node)

            a_root = a_root.left

        if b & mask:

            b_root.left.nodes.remove(node)

            b_root = b_root.right

        else:

            b_root = b_root.left

        mask //= 2

    a_root.nodes.remove(node)


def find(root, n):

    assert root.a <= n < root.b

    while root:

        for node in root.nodes:

            yield node

        if n < (root.a + root.b) // 2:

            root = root.left

        else:

            root = root.right


def create_struct(S, N):

    # segment tree

    # ~segment_root = SegmentNode(0, N)

    segment_root = SegmentNode(0, 2 ** 17)

    # suffix tree

    suffix_root = SuffixNode(None, [None] * 27)

    count = [0]

    for i in range(N):

        count[0] += extend(suffix_root, S, N, i, segment_root)

    return suffix_root, segment_root, count


def update_struct(st, S, N, P, C):

    _, segment_root, count = st

    C0 = S[P]

    S[P] = C

    for leaf in list(find(segment_root, P)):

        remove(segment_root, leaf)

        S[P] = C0

        i = leaf.suffix - 1

        node = leaf.parent

        node.suffix[S[i]] = None

        count[0] -= 1 + N - leaf.suffix

        while P < i and not any(node.suffix):

            i -= 1

            node = node.parent

            node.suffix[S[i]] = None

            count[0] -= 1

        while P < i:

            i -= 1

            node = node.parent

        S[P] = C

        count[0] += extend(node, S, N, P, segment_root)


def count_struct(st, N):

    suffix_root, _ = st

    return sum(

        1 if is_branch(node) else (1 + N - node.suffix)

        for node in traverse(suffix_root))


def suffix_repr(node):

    if is_branch(node):

        return '[%s]' % ' '.join(

            '%s:%s' % (

                '$' if i == 26 else chr(i + 97),

                suffix_repr(node.suffix[i]))

            for i in range(27)

            if node.suffix[i] is not None)

    else:

        return str(node.suffix)


def segment_repr1(node, indent=0):

    return '%s<%s:%s [%s]>%s' % (

        ' ' * indent,

        node.a, node.b,

        ', '.join(

            '%s:%s' % (n.suffix - n.depth, n.suffix)

            for n in node.nodes),

        ''.join(

            '\n' + segment_repr(c, indent + 2)

            for c in node.children))


def segment_repr(node, indent=0):

    return '%s<%s:%s [%s]>%s' % (

        ' ' * indent,

        node.a, node.b,

        ', '.join(

            '%s:%s' % (n.suffix - n.depth, n.suffix)

            for n in node.nodes),

        ''.join(

            '\n' + segment_repr(c, indent + 2)

            for c in (node.left, node.right) if c))


def check_struct(st):

    suffix_root, segment_root = st

    for node in traverse(suffix_root):

        if is_branch(node):

            for child in node.suffix:

                if child:

                    assert child.parent is node

                    assert child.depth == node.depth + 1


def struct_repr(st):

    check_struct(st)

    suffix_root, segment_root = st

    return suffix_repr(suffix_root) + '\n' + segment_repr(segment_root)


def main_3():

    import random

    az = 'abcdefghijklmnopqrstuvwxyz'

    def data():

        import random

        az = 'abcdefghijklmnopqrstuvwxyz'

        yield '75000 75000'

        yield ''.join(random.choice(az) for _ in range(75000))

        for _ in range(75000):

            yield '%s %s' % (random.randrange(1, 75001), random.choice(az))

    data = iter(data())

    def input2():

        return next(data)

    import time

    t0 = time.time()

    N, Q = map(int, input().split())

    S = bytearray(ord(c) - 97 for c in input())

    #S = bytearray(ord(c) - 97 for c in ''.join(random.choice(az) for _ in range(75000)))

    S.append(26)  # $

    st = create_struct(S, N)

    # print(struct_repr(st))

    t1 = time.time()

    #print(t1 - t0)

    tt = 0

    Qs = [input().split() for _ in range(Q)]

    for _ in range(Q):

        #P, C = input().split()

        P, C = Qs[_]

        P = int(P)

        C = ord(C) - 97  # ord('a')

        #P = random.randrange(1, 75001)

        # C = ord(random.choice(az)) - 97  # ord('a')

        t2 = time.time()

        update_struct(st, S, N, P - 1, C)

        # print(struct_repr(st))

        print(st[2][0])

        #~print(count_struct(st, N))

        tt += time.time() - t2


main_3()
