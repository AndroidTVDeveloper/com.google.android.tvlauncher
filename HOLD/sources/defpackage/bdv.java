package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bdv  reason: default package */
/* compiled from: PG */
final class bdv {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final StringBuilder c = new StringBuilder();
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public bdv(int i, int i2) {
        a(i);
        this.h = i2;
    }

    public final void a(char c2) {
        this.c.append(c2);
    }

    public final void b() {
        int length = this.c.length();
        if (length > 0) {
            this.c.delete(length - 1, length);
            int size = this.a.size() - 1;
            while (size >= 0) {
                bdu bdu = (bdu) this.a.get(size);
                int i = bdu.c;
                if (i == length) {
                    bdu.c = i - 1;
                    size--;
                } else {
                    return;
                }
            }
        }
    }

    public final bdj b(int i) {
        int i2;
        int i3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i4 = 0; i4 < this.b.size(); i4++) {
            spannableStringBuilder.append((CharSequence) this.b.get(i4));
            spannableStringBuilder.append(10);
        }
        spannableStringBuilder.append((CharSequence) c());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i5 = this.e + this.f;
        int length = (32 - i5) - spannableStringBuilder.length();
        int i6 = i5 - length;
        if (i == Integer.MIN_VALUE) {
            i = (this.g != 2 || (Math.abs(i6) >= 3 && length >= 0)) ? (this.g != 2 || i6 <= 0) ? 0 : 2 : 1;
        }
        float f2 = i != 1 ? i != 2 ? ((((float) i5) / 32.0f) * 0.8f) + 0.1f : ((((float) (32 - length)) / 32.0f) * 0.8f) + 0.1f : 0.5f;
        if (this.g != 1 && (i3 = this.d) <= 7) {
            i2 = 0;
        } else {
            i3 = this.d - 17;
            i2 = 2;
        }
        return new bdj(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, (float) i3, 1, i2, f2, i, -3.4028235E38f);
    }

    public final SpannableString c() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
        int length = spannableStringBuilder.length();
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = -1;
        boolean z = false;
        while (i < this.a.size()) {
            bdu bdu = (bdu) this.a.get(i);
            boolean z2 = bdu.b;
            int i7 = bdu.a;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i3 = bdw.a[i7];
                    z = z3;
                } else {
                    z = z3;
                }
            }
            int i8 = bdu.c;
            i++;
            if (i8 != (i < this.a.size() ? ((bdu) this.a.get(i)).c : length)) {
                if (i2 != -1 && !z2) {
                    a(spannableStringBuilder, i2, i8);
                    i2 = -1;
                } else if (i2 == -1 && z2) {
                    i2 = i8;
                }
                if (i4 != -1 && !z) {
                    b(spannableStringBuilder, i4, i8);
                    i4 = -1;
                } else if (i4 == -1 && z) {
                    i4 = i8;
                }
                if (i3 != i6) {
                    a(spannableStringBuilder, i5, i8, i6);
                    i6 = i3;
                    i5 = i8;
                }
            }
        }
        if (!(i2 == -1 || i2 == length)) {
            a(spannableStringBuilder, i2, length);
        }
        if (!(i4 == -1 || i4 == length)) {
            b(spannableStringBuilder, i4, length);
        }
        if (i5 != length) {
            a(spannableStringBuilder, i5, length, i6);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean a() {
        return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
    }

    public final void a(int i) {
        this.g = i;
        this.a.clear();
        this.b.clear();
        this.c.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f = 0;
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        if (i3 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
    }

    public final void a(int i, boolean z) {
        this.a.add(new bdu(i, z, this.c.length()));
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
    }
}
