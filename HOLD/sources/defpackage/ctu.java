package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.tvlauncher.appsview.BannerView;
import com.google.android.tvlauncher.home.view.ProgramView;
import com.google.android.tvlauncher.home.view.WatchNextInfoView;
import java.util.List;

/* renamed from: ctu  reason: default package */
/* compiled from: PG */
final class ctu extends jt {
    public int A;
    public float B;
    public int C;
    public float D;
    public int E;
    public float F;
    public Rect G;
    public int H;
    public float I;
    public int J;
    public float K;
    public int L;
    public float M;
    public int N;
    public float O;
    public int P;
    public float Q;
    public int R;
    public float S;
    public int T;
    public float U;
    public int V;
    public float W;
    public int X;
    public float Y;
    public int Z;
    public float aA;
    public float aa;
    public int ab;
    public float ac;
    public int ad;
    public float ae;
    public float af;
    public int ag;
    public Rect ah;
    public float ai;
    public float aj;
    public Rect ak;
    public Rect al;
    public float am;
    public float an;
    public float ao;
    public float ap;
    public Rect aq;
    public float ar;
    public float as;
    public int at;
    public Rect au;
    public float av;
    public float aw;
    public float ax;
    public int ay;
    public float az;
    public Rect e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public List m;
    public Rect n;
    public Rect o;
    public float p;
    public Rect q;
    public float r;
    public float s;
    public float t;
    public int u;
    public float v;
    public int w;
    public float x;
    public int y;
    public float z;

    private ctu() {
    }

    public /* synthetic */ ctu(byte b) {
    }

    public final jt a(km kmVar) {
        super.a(kmVar);
        this.e = dei.a(kmVar.a);
        this.f = kmVar.a.getScaleX();
        this.g = kmVar.a.getPivotX();
        this.h = kmVar.a.getPivotY();
        this.i = kmVar.a.getElevation();
        this.j = kmVar.a.getTranslationX();
        this.k = kmVar.a.getTranslationY();
        this.l = kmVar.a.getTranslationZ();
        View view = kmVar.a;
        if (view instanceof ProgramView) {
            ProgramView programView = (ProgramView) view;
            this.n = dei.a(programView.b);
            ImageView imageView = programView.c;
            this.o = dei.a(imageView);
            this.p = imageView.getScaleX();
            ImageView imageView2 = programView.d;
            this.q = dei.a(imageView2);
            this.r = imageView2.getScaleX();
            this.s = imageView2.getTranslationX();
            this.t = imageView2.getTranslationY();
            this.az = programView.e.a;
            View view2 = programView.g;
            this.u = view2.getLeft();
            this.v = view2.getTranslationX();
            this.w = view2.getTop();
            this.x = view2.getTranslationY();
            View view3 = programView.i;
            this.y = view3.getWidth();
            this.z = view3.getScaleX();
            this.A = view3.getTop();
            this.B = view3.getTranslationY();
            ProgressBar progressBar = programView.h;
            this.C = progressBar.getWidth();
            this.D = progressBar.getScaleX();
            this.E = progressBar.getTop();
            this.F = progressBar.getTranslationY();
            this.G = dei.a(programView.j);
            View view4 = programView.m;
            this.H = view4.getWidth();
            this.I = view4.getScaleX();
            this.J = view4.getTop();
            this.K = view4.getTranslationY();
            this.L = programView.n;
            this.M = view4.getAlpha();
            ImageView imageView3 = programView.k;
            this.N = imageView3.getTop();
            this.O = imageView3.getTranslationY();
            this.P = programView.l;
            this.Q = imageView3.getAlpha();
            ImageView imageView4 = programView.q;
            this.R = imageView4.getLeft();
            this.S = imageView4.getTranslationX();
            this.T = imageView4.getTop();
            this.U = imageView4.getTranslationY();
            this.V = programView.r;
            this.W = imageView4.getAlpha();
            View view5 = (View) programView.o.getParent();
            this.X = view5.getLeft();
            this.Y = view5.getTranslationX();
            this.Z = view5.getTop();
            this.aa = view5.getTranslationY();
            this.ab = programView.p;
            this.ac = programView.o.getAlpha();
            this.ad = programView.t;
            this.ae = programView.s.getAlpha();
        } else if (view instanceof cus) {
            cus cus = (cus) view;
            this.af = cus.d().getAlpha();
            this.ag = cus.e();
            this.az = cus.b();
            View view6 = kmVar.a;
            if (view6 instanceof BannerView) {
                BannerView bannerView = (BannerView) view6;
                if (bannerView.c() != null) {
                    this.aA = bannerView.g.o.a;
                }
            }
        } else if (view instanceof WatchNextInfoView) {
            WatchNextInfoView watchNextInfoView = (WatchNextInfoView) view;
            View view7 = watchNextInfoView.a;
            this.ah = dei.a(view7);
            this.ai = view7.getScaleX();
            this.aj = view7.getAlpha();
            this.ak = dei.a(watchNextInfoView.a());
            ImageView imageView5 = watchNextInfoView.b;
            this.al = dei.a(imageView5);
            this.am = imageView5.getScaleX();
            this.an = imageView5.getTranslationX();
            this.ao = imageView5.getTranslationY();
            this.ap = imageView5.getAlpha();
            TextView textView = watchNextInfoView.c;
            this.aq = dei.a(textView);
            this.ar = textView.getScaleY();
            this.as = textView.getTranslationX();
            this.at = textView.getCurrentTextColor();
            TextView textView2 = watchNextInfoView.d;
            this.au = dei.a(textView2);
            this.av = textView2.getScaleX();
            this.aw = textView2.getTranslationX();
            this.ax = textView2.getTranslationY();
            this.ay = textView2.getCurrentTextColor();
        }
        return this;
    }

    public final String toString() {
        String hexString = Integer.toHexString(hashCode());
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.m);
        float f2 = this.f;
        float f3 = this.h;
        String valueOf3 = String.valueOf(this.n);
        String valueOf4 = String.valueOf(this.o);
        float f4 = this.p;
        String valueOf5 = String.valueOf(this.q);
        float f5 = this.r;
        int length = String.valueOf(hexString).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 241 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("MyHolderInfo ");
        sb.append(hexString);
        sb.append(" bounds=");
        sb.append(valueOf);
        sb.append(", payloads=");
        sb.append(valueOf2);
        sb.append(", scale=");
        sb.append(f2);
        sb.append(", pivotY=");
        sb.append(f3);
        sb.append(", previewImageContainerBounds=");
        sb.append(valueOf3);
        sb.append(", previewImageBackgroundBounds=");
        sb.append(valueOf4);
        sb.append(", previewImageBackgroundScale=");
        sb.append(f4);
        sb.append(", previewImageBounds=");
        sb.append(valueOf5);
        sb.append(", previewImageScale=");
        sb.append(f5);
        return sb.toString();
    }
}
