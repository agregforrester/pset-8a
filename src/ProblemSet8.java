public class ProblemSet8 {

    public boolean common(int[] a, int[] b) {
        int startA = a[0];
        int startB = b[0];
        int endA = a[a.length - 1];
        int endB = b[b.length - 1];

        if (a == null || b == null || a.length == 0 || b.length == 0) {
            return false;
        } else if (startA == startB || endA == endB) {
            return true;
        } else {
            return false;
        }
    }

    public int[] middleman(int[] a, int[] b) {
        if (a == null || b == null || a.length % 2 == 0 || b.length % 2 == 0) {
            return null;
        } else {
            int middleA = (a.length - 1) / 2;
            int middleB = (b.length - 1) / 2;

            return new int[] {
                    a[middleA], b[middleB],
            };
        }
    }

    public int[] bigger(int[] a, int[] b) {
        if (a == null || b == null) {
            return null;
        } else {
            int sumA = 0;
            int sumB = 0;

            if (a.length == 0 && b.length != 0) {
                for (int j : b) {
                    sumB += j;
                }
            } else if (b.length == 0 && a.length != 0) {
                for (int j : a) {
                    sumA += j;
                }
            } else {
                for (int j : a) {
                    sumA += j;
                }
                for (int j : b) {
                    sumB += j;
                }
            }

            if (sumA > sumB) {
                return a;
            } else if (sumB > sumA) {
                return b;
            } else {
                return a;
            }
        }
    }

    public int[] doubleMiddle(int[] a, int[] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0 || a.length % 2 == 1 || b.length % 2 == 1) {
            return null;
        } else {
            int firstMiddleA = (a.length - 1) / 2;
            int secondMiddleA = a.length / 2;
            int firstMiddleB = (b.length - 1) / 2;
            int secondMiddleB = b.length / 2;

            return new int[] {
                    a[firstMiddleA], a[secondMiddleA], b[firstMiddleB], b[secondMiddleB],
            };
        }
    }

    public int[] swapMe(int[] a) {
        if (a == null) {
            return null;
        } else if (a.length == 0) {
            return a;
        } else {
            int start = a[0];
            int end = a[a.length - 1];
            a[0] = end;
            a[a.length - 1] = start;

            return a;
        }
    }

    public int[] threePoint(int[] a) {
        if (a == null || a.length % 2 == 0) {
            return null;
        } else {
            int start = a[0];
            int middle = a[(a.length - 1) / 2];
            int end = a[a.length - 1];

            return new int[] {
                    a[start], a[middle], a[end],
            };
        }
    }

    public int headHoncho(int[] a) {
        int counter = 0;

        if (a == null || a.length == 0) {
            return -1;
        }

        for (int j : a) {
            if (a[j] < 0) {
                return -1;
            }
        }

        for (int i : a) {
            if (a[i] > counter) {
                counter = a[i];
            }
        }

        return counter;
    }

    public boolean tippingPoint(int[] a, int threshold) {
        if (a == null) {
            return false;
        } else {
            int sum = 0;
            for (int i : a) {
                sum += a[i];
            }

            return sum > threshold;
        }
    }

    public String halfway(int[] a) {
        if (a == null || a.length == 0 || a.length % 2 == 1) {
            return null;
        } else {
            int firstSum = 0;
            int secondSum = 0;

            for (int i = 0; i < (a.length / 2); i++) {
                firstSum += a[i];
            }

            for (int j = a.length - 1; j > ((a.length - 1) / 2); j--) {
                secondSum += a[j];
            }

            if (firstSum > secondSum) {
                return "LEFT";
            } else {
                return "RIGHT";
            }
        }
    }

    public int[] sequential(int[] a, int[] b) {
        if (a == null || b == null || a.length + b.length != 3) {
            return null;
        } else {
            int[] c = new int[];
            for (int i : a) {
                c[c.length] = a[i];
                if (c.length == 3) {
                    return c;
                }
            }

            for (int i : b) {
                c[c.length] = b[i];
                if (c.length == 3) {
                    return c;
                }
            }

            return c;
        }
    }
}
