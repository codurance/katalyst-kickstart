int fact(int n)
{
    return n <= 1 ? n : fact(n - 1) * n;
}