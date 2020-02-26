package defpackage;

import java.util.Arrays;

/* renamed from: dlm  reason: default package */
/* compiled from: PG */
public final class dlm {
    public static final dlm a = new dlm(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    public boolean f;

    private dlm() {
        this(0, new int[8], new Object[8], true);
    }

    private dlm(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof dlm)) {
            dlm dlm = (dlm) obj;
            int i = this.b;
            if (i == dlm.b) {
                int[] iArr = this.c;
                int[] iArr2 = dlm.c;
                int i2 = 0;
                while (true) {
                    if (i2 < i) {
                        if (iArr[i2] != iArr2[i2]) {
                            break;
                        }
                        i2++;
                    } else {
                        Object[] objArr = this.d;
                        Object[] objArr2 = dlm.d;
                        int i3 = this.b;
                        int i4 = 0;
                        while (i4 < i3) {
                            if (objArr[i4].equals(objArr2[i4])) {
                                i4++;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int i;
        int i2 = this.e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.b; i4++) {
            int i5 = this.c[i4];
            int b2 = dme.b(i5);
            int a2 = dme.a(i5);
            if (a2 == 0) {
                i = din.c(b2, ((Long) this.d[i4]).longValue());
            } else if (a2 == 1) {
                ((Long) this.d[i4]).longValue();
                i = din.l(b2);
            } else if (a2 == 2) {
                i = din.a(b2, (dik) this.d[i4]);
            } else if (a2 == 3) {
                int a3 = din.a(b2);
                i = a3 + a3 + ((dlm) this.d[i4]).b();
            } else if (a2 == 5) {
                ((Integer) this.d[i4]).intValue();
                i = din.k(b2);
            } else {
                throw new IllegalStateException(djn.d());
            }
            i3 += i;
        }
        this.e = i3;
        return i3;
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.d;
        int i7 = this.b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    static dlm a(dlm dlm, dlm dlm2) {
        int i = dlm.b + dlm2.b;
        int[] copyOf = Arrays.copyOf(dlm.c, i);
        System.arraycopy(dlm2.c, 0, copyOf, dlm.b, dlm2.b);
        Object[] copyOf2 = Arrays.copyOf(dlm.d, i);
        System.arraycopy(dlm2.d, 0, copyOf2, dlm.b, dlm2.b);
        return new dlm(i, copyOf, copyOf2, true);
    }

    static dlm a() {
        return new dlm();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, Object obj) {
        int i2;
        if (this.f) {
            int i3 = this.b;
            int[] iArr = this.c;
            if (i3 == iArr.length) {
                if (i3 >= 4) {
                    i2 = i3 >> 1;
                } else {
                    i2 = 8;
                }
                int i4 = i3 + i2;
                this.c = Arrays.copyOf(iArr, i4);
                this.d = Arrays.copyOf(this.d, i4);
            }
            int[] iArr2 = this.c;
            int i5 = this.b;
            iArr2[i5] = i;
            this.d[i5] = obj;
            this.b = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void a(dmf dmf) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int b2 = dme.b(i2);
                int a2 = dme.a(i2);
                if (a2 == 0) {
                    dmf.a(b2, ((Long) obj).longValue());
                } else if (a2 == 1) {
                    dmf.d(b2, ((Long) obj).longValue());
                } else if (a2 == 2) {
                    dmf.a(b2, (dik) obj);
                } else if (a2 == 3) {
                    dio dio = (dio) dmf;
                    dio.a.f(b2, 3);
                    ((dlm) obj).a(dmf);
                    dio.a.f(b2, 4);
                } else if (a2 == 5) {
                    dmf.d(b2, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(djn.d());
                }
            }
        }
    }
}
