package defpackage;

/* renamed from: dkv  reason: default package */
/* compiled from: PG */
final class dkv implements dkh {
    public final dkk a;
    public final String b;
    public final Object[] c;
    private final int d;

    public dkv(dkk dkk, String str, Object[] objArr) {
        this.a = dkk;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt >= 55296) {
            char c2 = charAt & 8191;
            int i = 13;
            int i2 = 1;
            while (true) {
                int i3 = i2 + 1;
                char charAt2 = str.charAt(i2);
                if (charAt2 >= 55296) {
                    c2 |= (charAt2 & 8191) << i;
                    i += 13;
                    i2 = i3;
                } else {
                    this.d = c2 | (charAt2 << i);
                    return;
                }
            }
        } else {
            this.d = charAt;
        }
    }

    public final boolean a() {
        return (this.d & 2) == 2;
    }

    public final dkk b() {
        return this.a;
    }

    public final int c() {
        return (this.d & 1) == 0 ? 2 : 1;
    }
}
