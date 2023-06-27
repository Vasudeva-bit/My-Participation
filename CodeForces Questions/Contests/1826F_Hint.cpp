#include <bits/stdc++.h>
using namespace std;
double xx[30], yy[30], xa[30], ya[30];
const double eps = 5e-4;
int n, ct1, ct2, ct;
struct p
{
    double x, y;
    p(double a = 0, double b = 0)
    {
        x = a, y = b;
    }
} a[1005], b[1005], ans[1005];
p del(p a, p b)
{
    p c;
    c.x = a.x - b.x;
    c.y = a.y - b.y;
    return c;
}
struct line
{
    p s, t, l;
    line(p a = p(0, 0), p b = p(0, 0))
    {
        s = a, t = b;
        l = del(t, s);
    }
} s[1005];
p mul(p a, double b)
{
    p c;
    c.x = a.x * b;
    c.y = a.y * b;
    return c;
}
p add(p a, p b)
{
    p c;
    c.x = a.x + b.x;
    c.y = a.y + b.y;
    return c;
}
double dc(p a, p b)
{
    return a.x * b.x + a.y * b.y;
}
double xc(p a, p b)
{
    return a.x * b.y - a.y * b.x;
}
p jd(line a, line b)
{
    if (fabs(xc(a.l, b.l)) < eps)
        return p(0, 0);
    double c = xc(del(b.s, a.s), del(b.t, a.s));
    double d = xc(del(b.t, a.t), del(b.s, a.t));
    return add(a.s, mul(a.l, c / (c + d)));
}
int main()
{
    int t;
    scanf("%d", &t);
    double x, y;
    while (t--)
    {
        scanf("%d", &n);
        ct1 = ct2 = ct = 0;
        printf("? 0 1 0\n");
        fflush(stdout);
        for (int i = 1; i <= n; i++)
            scanf("%lf%lf", &xx[i], &y);
        printf("? 1 0 0\n");
        fflush(stdout);
        for (int i = 1; i <= n; i++)
            scanf("%lf%lf", &x, &yy[i]);
        sort(xx + 1, xx + n + 1);
        sort(yy + 1, yy + n + 1);
        xa[++ct1] = xx[1];
        ya[++ct2] = yy[1];
        for (int i = 2; i <= n; i++)
        {
            if (fabs(xx[i] - xx[i - 1]) > eps)
                xa[++ct1] = xx[i];
            if (fabs(yy[i] - yy[i - 1]) > eps)
                ya[++ct2] = yy[i];
        }
        for (int i = 1; i <= ct1; i++)
            for (int j = 1; j <= ct2; j++)
                a[++ct] = p(xa[i], ya[j]);
        line l(p(0, 0), p(400, -1));
        for (int i = 1; i <= ct; i++)
        {
            line s(a[i], p(a[i].x + 1, a[i].y + 400));
            b[i] = jd(s, l);
            // cout<<b[i].x<<" "<<b[i].y<<" "<<b[i].y/b[i].x<<endl;
        }
        printf("? 0.1 40 0\n");
        fflush(stdout);
        for (int i = 1; i <= n; i++)
        {
            scanf("%lf%lf", &x, &y);
            for (int j = 1; j <= ct; j++)
                if (fabs(b[j].x - x) < eps && fabs(b[j].y - y) < eps)
                    ans[i] = a[j];
        }
        printf("!");
        for (int i = 1; i <= n; i++)
            printf(" %.10lf %.10lf", ans[i].x, ans[i].y);
        printf("\n");
        fflush(stdout);
    }
}
