package p000;

/* renamed from: wp */
/* compiled from: PG */
final class C0612wp implements Appendable {

    /* renamed from: a */
    private final Appendable f10719a;

    /* renamed from: b */
    private boolean f10720b = true;

    public C0612wp(Appendable appendable) {
        this.f10719a = appendable;
    }

    /* renamed from: a */
    private static final CharSequence m8565a(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    public final Appendable append(char c) {
        boolean z = false;
        if (this.f10720b) {
            this.f10720b = false;
            this.f10719a.append("  ");
        }
        if (c == 10) {
            z = true;
        }
        this.f10720b = z;
        this.f10719a.append(c);
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        CharSequence a = m8565a(charSequence);
        append(a, 0, a.length());
        return this;
    }

    public final Appendable append(CharSequence charSequence, int i, int i2) {
        CharSequence a = m8565a(charSequence);
        boolean z = false;
        if (this.f10720b) {
            this.f10720b = false;
            this.f10719a.append("  ");
        }
        if (a.length() > 0 && a.charAt(i2 - 1) == 10) {
            z = true;
        }
        this.f10720b = z;
        this.f10719a.append(a, i, i2);
        return this;
    }
}
