package p000;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bdv */
/* compiled from: PG */
final class bdv {

    /* renamed from: a */
    public final List f3442a = new ArrayList();

    /* renamed from: b */
    public final List f3443b = new ArrayList();

    /* renamed from: c */
    public final StringBuilder f3444c = new StringBuilder();

    /* renamed from: d */
    public int f3445d;

    /* renamed from: e */
    public int f3446e;

    /* renamed from: f */
    public int f3447f;

    /* renamed from: g */
    public int f3448g;

    /* renamed from: h */
    public int f3449h;

    public bdv(int i, int i2) {
        mo1788a(i);
        this.f3449h = i2;
    }

    /* renamed from: a */
    public final void mo1787a(char c) {
        this.f3444c.append(c);
    }

    /* renamed from: b */
    public final void mo1792b() {
        int length = this.f3444c.length();
        if (length > 0) {
            this.f3444c.delete(length - 1, length);
            int size = this.f3442a.size() - 1;
            while (size >= 0) {
                bdu bdu = (bdu) this.f3442a.get(size);
                int i = bdu.f3441c;
                if (i == length) {
                    bdu.f3441c = i - 1;
                    size--;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final bdj mo1791b(int i) {
        int i2;
        int i3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i4 = 0; i4 < this.f3443b.size(); i4++) {
            spannableStringBuilder.append((CharSequence) this.f3443b.get(i4));
            spannableStringBuilder.append(10);
        }
        spannableStringBuilder.append((CharSequence) mo1793c());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i5 = this.f3446e + this.f3447f;
        int length = (32 - i5) - spannableStringBuilder.length();
        int i6 = i5 - length;
        if (i == Integer.MIN_VALUE) {
            i = (this.f3448g != 2 || (Math.abs(i6) >= 3 && length >= 0)) ? (this.f3448g != 2 || i6 <= 0) ? 0 : 2 : 1;
        }
        float f = i != 1 ? i != 2 ? ((((float) i5) / 32.0f) * 0.8f) + 0.1f : ((((float) (32 - length)) / 32.0f) * 0.8f) + 0.1f : 0.5f;
        if (this.f3448g != 1 && (i3 = this.f3445d) <= 7) {
            i2 = 0;
        } else {
            i3 = this.f3445d - 17;
            i2 = 2;
        }
        return new bdj(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, (float) i3, 1, i2, f, i, -3.4028235E38f);
    }

    /* renamed from: c */
    public final SpannableString mo1793c() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f3444c);
        int length = spannableStringBuilder.length();
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = -1;
        boolean z = false;
        while (i < this.f3442a.size()) {
            bdu bdu = (bdu) this.f3442a.get(i);
            boolean z2 = bdu.f3440b;
            int i7 = bdu.f3439a;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i3 = bdw.f3450a[i7];
                    z = z3;
                } else {
                    z = z3;
                }
            }
            int i8 = bdu.f3441c;
            i++;
            if (i8 != (i < this.f3442a.size() ? ((bdu) this.f3442a.get(i)).f3441c : length)) {
                if (i2 != -1 && !z2) {
                    m2928a(spannableStringBuilder, i2, i8);
                    i2 = -1;
                } else if (i2 == -1 && z2) {
                    i2 = i8;
                }
                if (i4 != -1 && !z) {
                    m2930b(spannableStringBuilder, i4, i8);
                    i4 = -1;
                } else if (i4 == -1 && z) {
                    i4 = i8;
                }
                if (i3 != i6) {
                    m2929a(spannableStringBuilder, i5, i8, i6);
                    i6 = i3;
                    i5 = i8;
                }
            }
        }
        if (!(i2 == -1 || i2 == length)) {
            m2928a(spannableStringBuilder, i2, length);
        }
        if (!(i4 == -1 || i4 == length)) {
            m2930b(spannableStringBuilder, i4, length);
        }
        if (i5 != length) {
            m2929a(spannableStringBuilder, i5, length, i6);
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* renamed from: a */
    public final boolean mo1790a() {
        return this.f3442a.isEmpty() && this.f3443b.isEmpty() && this.f3444c.length() == 0;
    }

    /* renamed from: a */
    public final void mo1788a(int i) {
        this.f3448g = i;
        this.f3442a.clear();
        this.f3443b.clear();
        this.f3444c.setLength(0);
        this.f3445d = 15;
        this.f3446e = 0;
        this.f3447f = 0;
    }

    /* renamed from: a */
    private static void m2929a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        if (i3 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }
    }

    /* renamed from: b */
    private static void m2930b(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
    }

    /* renamed from: a */
    public final void mo1789a(int i, boolean z) {
        this.f3442a.add(new bdu(i, z, this.f3444c.length()));
    }

    /* renamed from: a */
    private static void m2928a(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
    }
}
