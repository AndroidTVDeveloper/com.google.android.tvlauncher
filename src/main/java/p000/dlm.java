package p000;

import java.util.Arrays;

/* renamed from: dlm */
/* compiled from: PG */
public final class dlm {

    /* renamed from: a */
    public static final dlm f8766a = new dlm(0, new int[0], new Object[0], false);

    /* renamed from: b */
    public int f8767b;

    /* renamed from: c */
    public int[] f8768c;

    /* renamed from: d */
    public Object[] f8769d;

    /* renamed from: e */
    public int f8770e;

    /* renamed from: f */
    public boolean f8771f;

    private dlm() {
        this(0, new int[8], new Object[8], true);
    }

    private dlm(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f8770e = -1;
        this.f8767b = i;
        this.f8768c = iArr;
        this.f8769d = objArr;
        this.f8771f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof dlm)) {
            dlm dlm = (dlm) obj;
            int i = this.f8767b;
            if (i == dlm.f8767b) {
                int[] iArr = this.f8768c;
                int[] iArr2 = dlm.f8768c;
                int i2 = 0;
                while (true) {
                    if (i2 < i) {
                        if (iArr[i2] != iArr2[i2]) {
                            break;
                        }
                        i2++;
                    } else {
                        Object[] objArr = this.f8769d;
                        Object[] objArr2 = dlm.f8769d;
                        int i3 = this.f8767b;
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

    /* renamed from: b */
    public final int mo4629b() {
        int i;
        int i2 = this.f8770e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f8767b; i4++) {
            int i5 = this.f8768c[i4];
            int b = dme.m7094b(i5);
            int a = dme.m7092a(i5);
            if (a == 0) {
                i = din.m6552c(b, ((Long) this.f8769d[i4]).longValue());
            } else if (a == 1) {
                ((Long) this.f8769d[i4]).longValue();
                i = din.m6568l(b);
            } else if (a == 2) {
                i = din.m6529a(b, (dik) this.f8769d[i4]);
            } else if (a == 3) {
                int a2 = din.m6528a(b);
                i = a2 + a2 + ((dlm) this.f8769d[i4]).mo4629b();
            } else if (a == 5) {
                ((Integer) this.f8769d[i4]).intValue();
                i = din.m6567k(b);
            } else {
                throw new IllegalStateException(djn.m6734d());
            }
            i3 += i;
        }
        this.f8770e = i3;
        return i3;
    }

    public final int hashCode() {
        int i = this.f8767b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f8768c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f8769d;
        int i7 = this.f8767b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: a */
    static dlm m6973a(dlm dlm, dlm dlm2) {
        int i = dlm.f8767b + dlm2.f8767b;
        int[] copyOf = Arrays.copyOf(dlm.f8768c, i);
        System.arraycopy(dlm2.f8768c, 0, copyOf, dlm.f8767b, dlm2.f8767b);
        Object[] copyOf2 = Arrays.copyOf(dlm.f8769d, i);
        System.arraycopy(dlm2.f8769d, 0, copyOf2, dlm.f8767b, dlm2.f8767b);
        return new dlm(i, copyOf, copyOf2, true);
    }

    /* renamed from: a */
    static dlm m6972a() {
        return new dlm();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4627a(int i, Object obj) {
        int i2;
        if (this.f8771f) {
            int i3 = this.f8767b;
            int[] iArr = this.f8768c;
            if (i3 == iArr.length) {
                if (i3 >= 4) {
                    i2 = i3 >> 1;
                } else {
                    i2 = 8;
                }
                int i4 = i3 + i2;
                this.f8768c = Arrays.copyOf(iArr, i4);
                this.f8769d = Arrays.copyOf(this.f8769d, i4);
            }
            int[] iArr2 = this.f8768c;
            int i5 = this.f8767b;
            iArr2[i5] = i;
            this.f8769d[i5] = obj;
            this.f8767b = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo4628a(dmf dmf) {
        if (this.f8767b != 0) {
            for (int i = 0; i < this.f8767b; i++) {
                int i2 = this.f8768c[i];
                Object obj = this.f8769d[i];
                int b = dme.m7094b(i2);
                int a = dme.m7092a(i2);
                if (a == 0) {
                    dmf.mo4447a(b, ((Long) obj).longValue());
                } else if (a == 1) {
                    dmf.mo4458d(b, ((Long) obj).longValue());
                } else if (a == 2) {
                    dmf.mo4448a(b, (dik) obj);
                } else if (a == 3) {
                    dio dio = (dio) dmf;
                    dio.f8594a.mo4437f(b, 3);
                    ((dlm) obj).mo4628a(dmf);
                    dio.f8594a.mo4437f(b, 4);
                } else if (a == 5) {
                    dmf.mo4457d(b, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(djn.m6734d());
                }
            }
        }
    }
}
