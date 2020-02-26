package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: bff  reason: default package */
/* compiled from: PG */
public final class bff extends anm {
    private final bky d = new bky();
    private final boolean e;
    private final int f;
    private final int g;
    private final String h;
    private float i;
    private int j;

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
            this.f = bArr[24];
            this.g = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.h = "Serif".equals(blm.a(bArr, 43, bArr.length + -43)) ? "serif" : str;
            int i2 = bArr[25] * 20;
            this.j = i2;
            z = (bArr[0] & 32) != 0 ? true : z;
            this.e = z;
            if (!z) {
                this.i = 0.85f;
                return;
            }
            float f2 = ((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i2);
            this.i = f2;
            this.i = blm.a(f2, 0.0f, 0.95f);
            return;
        }
        this.f = 0;
        this.g = -1;
        this.h = str;
        this.e = false;
        this.i = 0.85f;
    }

    private static void a(boolean z) {
        if (!z) {
            throw new bdn("Unexpected subtitle format.");
        }
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i2 >>> 8) | ((i2 & 255) << 24)), i4, i5, i6 | 33);
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            int i7 = i6 | 33;
            int i8 = i2 & 1;
            int i9 = i2 & 2;
            if (i8 != 0) {
                if (i9 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i4, i5, i7);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i4, i5, i7);
                }
            } else if (i9 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, i5, i7);
            }
            if ((i2 & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, i5, i7);
            } else if (i8 == 0 && i9 == 0) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i4, i5, i7);
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
    public final bdl a(byte[] bArr, int i2, boolean z) {
        String str;
        boolean z2;
        this.d.a(bArr, i2);
        bky bky = this.d;
        a(bky.b() >= 2);
        int e2 = bky.e();
        if (e2 == 0) {
            str = "";
        } else {
            if (bky.b() >= 2) {
                byte[] bArr2 = bky.a;
                int i3 = bky.b;
                byte b = (bArr2[i3 + 1] & 255) | ((bArr2[i3] & 255) << 8);
                if (b == 65279 || b == 65534) {
                    str = bky.a(e2, Charset.forName("UTF-16"));
                }
            }
            str = bky.a(e2, Charset.forName("UTF-8"));
        }
        if (str.isEmpty()) {
            return bfg.a;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        a(spannableStringBuilder2, this.f, 0, 0, spannableStringBuilder.length(), 16711680);
        b(spannableStringBuilder2, this.g, -1, 0, spannableStringBuilder.length(), 16711680);
        String str2 = this.h;
        int length = spannableStringBuilder.length();
        if (str2 != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str2), 0, length, 16711713);
        }
        float f2 = this.i;
        while (this.d.b() >= 8) {
            bky bky2 = this.d;
            int i4 = bky2.b;
            int j2 = bky2.j();
            int j3 = this.d.j();
            if (j3 == 1937013100) {
                if (this.d.b() >= 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                a(z2);
                int e3 = this.d.e();
                for (int i5 = 0; i5 < e3; i5++) {
                    bky bky3 = this.d;
                    a(bky3.b() >= 12);
                    int e4 = bky3.e();
                    int e5 = bky3.e();
                    bky3.d(2);
                    int d2 = bky3.d();
                    bky3.d(1);
                    int j4 = bky3.j();
                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                    int i6 = e4;
                    int i7 = e5;
                    a(spannableStringBuilder3, d2, this.f, i6, i7, 0);
                    b(spannableStringBuilder3, j4, this.g, i6, i7, 0);
                }
            } else if (j3 == 1952608120 && this.e) {
                a(this.d.b() >= 2);
                f2 = blm.a(((float) this.d.e()) / ((float) this.j), 0.0f, 0.95f);
            }
            this.d.c(i4 + j2);
        }
        return new bfg(new bdj(spannableStringBuilder, (Layout.Alignment) null, f2, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f));
    }
}
