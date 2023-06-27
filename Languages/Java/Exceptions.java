class exceptionHandle {
    Scanner scan = new Scanner(System.in);
    try {
        int n;
        int sum = 0;
        n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = scan.nextInt();
            sum += a[i];
        }
        System.out.println(sum/n);
    }
    catch (NegativeArraySizeException)
        System.out.println("Array size should not be negative!");
    catch (ArithmeticException) 
        System.out.println("Cannot divide by zero");
    catch (Exception e)
        System.out.println("Some exception occured");
    System.out.println("Thanks for usign our sevice");
    // A single try block could have multiple catch blocks, if a try block is expected to have more than one kind of exception.
    // For example, dividing a element with index out of bounds with zero simultaneously raises a IndexOutOfBounds and an Arithmetic Exception.
    // JVM catches the exception if no catch block catches the exception 
}