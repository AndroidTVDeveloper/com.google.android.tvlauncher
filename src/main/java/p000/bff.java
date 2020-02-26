package p000;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: bff */
/* compiled from: PG */
public final class bff extends anm {

    /* renamed from: d */
    private final bky f3662d = new bky();

    /* renamed from: e */
    private final boolean f3663e;

    /* renamed from: f */
    private final int f3664f;

    /* renamed from: g */
    private final int f3665g;

    /* renamed from: h */
    private final String f3666h;

    /* renamed from: i */
    private float f3667i;

    /* renamed from: j */
    private int f3668j;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(float, float, float):float
     arg types: [float, int, int]
     candidates:
      blm.a(int, int, int):int
      blm.a(java.util.List, java.lang.Comparable, boolean):int
      blm.a(long[], long, boolean):int
      blm.a(long, long, long):long
      blm.a(java.lang.StringBuilder, java.util.Formatter, long):java.lang.String
      blm.a(byte[], int, int):java.lang.String
      blm.a(java.util.List, int, int):void
      blm.a(bky, bky, java.util.zip.Inflater):boolean
      blm.a(float, float, float):float */
    public bff(List list) {
        String str = "sans-serif";
        boolean z = false;
        if (list != null && list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f3664f = bArr[24];
            this.f3665g = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f3666h = "Serif".equals(blm.m3641a(bArr, 43, bArr.length + -43)) ? "serif" : str;
            int i = bArr[25] * 20;
            this.f3668j = i;
            z = (bArr[0] & 32) != 0 ? true : z;
            this.f3663e = z;
            if (!z) {
                this.f3667i = 0.85f;
                return;
            }
            float f = ((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i);
            this.f3667i = f;
            this.f3667i = blm.m3622a(f, 0.0f, 0.95f);
            return;
        }
        this.f3664f = 0;
        this.f3665g = -1;
        this.f3666h = str;
        this.f3663e = false;
        this.f3667i = 0.85f;
    }

    /* renamed from: a */
    private static void m3042a(boolean z) {
        if (!z) {
            throw new bdn("Unexpected subtitle format.");
        }
    }

    /* renamed from: b */
    private static void m3043b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* renamed from: a */
    private static void m3041a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            if (i7 != 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (i8 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else if (i7 == 0 && i8 == 0) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(float, float, float):float
     arg types: [float, int, int]
     candidates:
      blm.a(int, int, int):int
      blm.a(java.util.List, java.lang.Comparable, boolean):int
      blm.a(long[], long, boolean):int
      blm.a(long, long, long):long
      blm.a(java.lang.StringBuilder, java.util.Formatter, long):java.lang.String
      blm.a(byte[], int, int):java.lang.String
      blm.a(java.util.List, int, int):void
      blm.a(bky, bky, java.util.zip.Inflater):boolean
      blm.a(float, float, float):float */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bdl mo1155a(byte[] bArr, int i, boolean z) {
        String str;
        boolean z2;
        this.f3662d.mo2068a(bArr, i);
        bky bky = this.f3662d;
        m3042a(bky.mo2070b() >= 2);
        int e = bky.mo2076e();
        if (e == 0) {
            str = "";
        } else {
            if (bky.mo2070b() >= 2) {
                byte[] bArr2 = bky.f4258a;
                int i2 = bky.f4259b;
                byte b = (bArr2[i2 + 1] & 255) | ((bArr2[i2] & 255) << 8);
                if (b == 65279 || b == 65534) {
                    str = bky.mo2063a(e, Charset.forName("UTF-16"));
                }
            }
            str = bky.mo2063a(e, Charset.forName("UTF-8"));
        }
        if (str.isEmpty()) {
            return bfg.f3669a;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        m3041a(spannableStringBuilder2, this.f3664f, 0, 0, spannableStringBuilder.length(), 16711680);
        m3043b(spannableStringBuilder2, this.f3665g, -1, 0, spannableStringBuilder.length(), 16711680);
        String str2 = this.f3666h;
        int length = spannableStringBuilder.length();
        if (str2 != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str2), 0, length, 16711713);
        }
        float f = this.f3667i;
        while (this.f3662d.mo2070b() >= 8) {
            bky bky2 = this.f3662d;
            int i3 = bky2.f4259b;
            int j = bky2.mo2083j();
            int j2 = this.f3662d.mo2083j();
            if (j2 == 1937013100) {
                if (this.f3662d.mo2070b() >= 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                m3042a(z2);
                int e2 = this.f3662d.mo2076e();
                for (int i4 = 0; i4 < e2; i4++) {
                    bky bky3 = this.f3662d;
                    m3042a(bky3.mo2070b() >= 12);
                    int e3 = bky3.mo2076e();
                    int e4 = bky3.mo2076e();
                    bky3.mo2075d(2);
                    int d = bky3.mo2074d();
                    bky3.mo2075d(1);
                    int j3 = bky3.mo2083j();
                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                    int i5 = e3;
                    int i6 = e4;
                    m3041a(spannableStringBuilder3, d, this.f3664f, i5, i6, 0);
                    m3043b(spannableStringBuilder3, j3, this.f3665g, i5, i6, 0);
                }
            } else if (j2 == 1952608120 && this.f3663e) {
                m3042a(this.f3662d.mo2070b() >= 2);
                f = blm.m3622a(((float) this.f3662d.mo2076e()) / ((float) this.f3668j), 0.0f, 0.95f);
            }
            this.f3662d.mo2073c(i3 + j);
        }
        return new bfg(new bdj(spannableStringBuilder, (Layout.Alignment) null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f));
    }
}
