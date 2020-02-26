package p000;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.tvlauncher.appsview.BannerView;
import com.google.android.tvlauncher.home.view.ProgramView;
import com.google.android.tvlauncher.home.view.WatchNextInfoView;
import java.util.List;

/* renamed from: ctu */
/* compiled from: PG */
final class ctu extends C0265jt {

    /* renamed from: A */
    public int f7423A;

    /* renamed from: B */
    public float f7424B;

    /* renamed from: C */
    public int f7425C;

    /* renamed from: D */
    public float f7426D;

    /* renamed from: E */
    public int f7427E;

    /* renamed from: F */
    public float f7428F;

    /* renamed from: G */
    public Rect f7429G;

    /* renamed from: H */
    public int f7430H;

    /* renamed from: I */
    public float f7431I;

    /* renamed from: J */
    public int f7432J;

    /* renamed from: K */
    public float f7433K;

    /* renamed from: L */
    public int f7434L;

    /* renamed from: M */
    public float f7435M;

    /* renamed from: N */
    public int f7436N;

    /* renamed from: O */
    public float f7437O;

    /* renamed from: P */
    public int f7438P;

    /* renamed from: Q */
    public float f7439Q;

    /* renamed from: R */
    public int f7440R;

    /* renamed from: S */
    public float f7441S;

    /* renamed from: T */
    public int f7442T;

    /* renamed from: U */
    public float f7443U;

    /* renamed from: V */
    public int f7444V;

    /* renamed from: W */
    public float f7445W;

    /* renamed from: X */
    public int f7446X;

    /* renamed from: Y */
    public float f7447Y;

    /* renamed from: Z */
    public int f7448Z;

    /* renamed from: aA */
    public float f7449aA;

    /* renamed from: aa */
    public float f7450aa;

    /* renamed from: ab */
    public int f7451ab;

    /* renamed from: ac */
    public float f7452ac;

    /* renamed from: ad */
    public int f7453ad;

    /* renamed from: ae */
    public float f7454ae;

    /* renamed from: af */
    public float f7455af;

    /* renamed from: ag */
    public int f7456ag;

    /* renamed from: ah */
    public Rect f7457ah;

    /* renamed from: ai */
    public float f7458ai;

    /* renamed from: aj */
    public float f7459aj;

    /* renamed from: ak */
    public Rect f7460ak;

    /* renamed from: al */
    public Rect f7461al;

    /* renamed from: am */
    public float f7462am;

    /* renamed from: an */
    public float f7463an;

    /* renamed from: ao */
    public float f7464ao;

    /* renamed from: ap */
    public float f7465ap;

    /* renamed from: aq */
    public Rect f7466aq;

    /* renamed from: ar */
    public float f7467ar;

    /* renamed from: as */
    public float f7468as;

    /* renamed from: at */
    public int f7469at;

    /* renamed from: au */
    public Rect f7470au;

    /* renamed from: av */
    public float f7471av;

    /* renamed from: aw */
    public float f7472aw;

    /* renamed from: ax */
    public float f7473ax;

    /* renamed from: ay */
    public int f7474ay;

    /* renamed from: az */
    public float f7475az;

    /* renamed from: e */
    public Rect f7476e;

    /* renamed from: f */
    public float f7477f;

    /* renamed from: g */
    public float f7478g;

    /* renamed from: h */
    public float f7479h;

    /* renamed from: i */
    public float f7480i;

    /* renamed from: j */
    public float f7481j;

    /* renamed from: k */
    public float f7482k;

    /* renamed from: l */
    public float f7483l;

    /* renamed from: m */
    public List f7484m;

    /* renamed from: n */
    public Rect f7485n;

    /* renamed from: o */
    public Rect f7486o;

    /* renamed from: p */
    public float f7487p;

    /* renamed from: q */
    public Rect f7488q;

    /* renamed from: r */
    public float f7489r;

    /* renamed from: s */
    public float f7490s;

    /* renamed from: t */
    public float f7491t;

    /* renamed from: u */
    public int f7492u;

    /* renamed from: v */
    public float f7493v;

    /* renamed from: w */
    public int f7494w;

    /* renamed from: x */
    public float f7495x;

    /* renamed from: y */
    public int f7496y;

    /* renamed from: z */
    public float f7497z;

    private ctu() {
    }

    public /* synthetic */ ctu(byte b) {
    }

    /* renamed from: a */
    public final C0265jt mo3742a(C0285km kmVar) {
        super.mo3742a(kmVar);
        this.f7476e = dei.m6235a(kmVar.f9783a);
        this.f7477f = kmVar.f9783a.getScaleX();
        this.f7478g = kmVar.f9783a.getPivotX();
        this.f7479h = kmVar.f9783a.getPivotY();
        this.f7480i = kmVar.f9783a.getElevation();
        this.f7481j = kmVar.f9783a.getTranslationX();
        this.f7482k = kmVar.f9783a.getTranslationY();
        this.f7483l = kmVar.f9783a.getTranslationZ();
        View view = kmVar.f9783a;
        if (view instanceof ProgramView) {
            ProgramView programView = (ProgramView) view;
            this.f7485n = dei.m6235a(programView.f6566b);
            ImageView imageView = programView.f6567c;
            this.f7486o = dei.m6235a(imageView);
            this.f7487p = imageView.getScaleX();
            ImageView imageView2 = programView.f6568d;
            this.f7488q = dei.m6235a(imageView2);
            this.f7489r = imageView2.getScaleX();
            this.f7490s = imageView2.getTranslationX();
            this.f7491t = imageView2.getTranslationY();
            this.f7475az = programView.f6569e.f7612a;
            View view2 = programView.f6571g;
            this.f7492u = view2.getLeft();
            this.f7493v = view2.getTranslationX();
            this.f7494w = view2.getTop();
            this.f7495x = view2.getTranslationY();
            View view3 = programView.f6573i;
            this.f7496y = view3.getWidth();
            this.f7497z = view3.getScaleX();
            this.f7423A = view3.getTop();
            this.f7424B = view3.getTranslationY();
            ProgressBar progressBar = programView.f6572h;
            this.f7425C = progressBar.getWidth();
            this.f7426D = progressBar.getScaleX();
            this.f7427E = progressBar.getTop();
            this.f7428F = progressBar.getTranslationY();
            this.f7429G = dei.m6235a(programView.f6574j);
            View view4 = programView.f6577m;
            this.f7430H = view4.getWidth();
            this.f7431I = view4.getScaleX();
            this.f7432J = view4.getTop();
            this.f7433K = view4.getTranslationY();
            this.f7434L = programView.f6578n;
            this.f7435M = view4.getAlpha();
            ImageView imageView3 = programView.f6575k;
            this.f7436N = imageView3.getTop();
            this.f7437O = imageView3.getTranslationY();
            this.f7438P = programView.f6576l;
            this.f7439Q = imageView3.getAlpha();
            ImageView imageView4 = programView.f6581q;
            this.f7440R = imageView4.getLeft();
            this.f7441S = imageView4.getTranslationX();
            this.f7442T = imageView4.getTop();
            this.f7443U = imageView4.getTranslationY();
            this.f7444V = programView.f6582r;
            this.f7445W = imageView4.getAlpha();
            View view5 = (View) programView.f6579o.getParent();
            this.f7446X = view5.getLeft();
            this.f7447Y = view5.getTranslationX();
            this.f7448Z = view5.getTop();
            this.f7450aa = view5.getTranslationY();
            this.f7451ab = programView.f6580p;
            this.f7452ac = programView.f6579o.getAlpha();
            this.f7453ad = programView.f6584t;
            this.f7454ae = programView.f6583s.getAlpha();
        } else if (view instanceof cus) {
            cus cus = (cus) view;
            this.f7455af = cus.mo3230d().getAlpha();
            this.f7456ag = cus.mo3231e();
            this.f7475az = cus.mo3227b();
            View view6 = kmVar.f9783a;
            if (view6 instanceof BannerView) {
                BannerView bannerView = (BannerView) view6;
                if (bannerView.mo3229c() != null) {
                    this.f7449aA = bannerView.f6398g.f5549o.f7612a;
                }
            }
        } else if (view instanceof WatchNextInfoView) {
            WatchNextInfoView watchNextInfoView = (WatchNextInfoView) view;
            View view7 = watchNextInfoView.f6589a;
            this.f7457ah = dei.m6235a(view7);
            this.f7458ai = view7.getScaleX();
            this.f7459aj = view7.getAlpha();
            this.f7460ak = dei.m6235a(watchNextInfoView.mo3418a());
            ImageView imageView5 = watchNextInfoView.f6590b;
            this.f7461al = dei.m6235a(imageView5);
            this.f7462am = imageView5.getScaleX();
            this.f7463an = imageView5.getTranslationX();
            this.f7464ao = imageView5.getTranslationY();
            this.f7465ap = imageView5.getAlpha();
            TextView textView = watchNextInfoView.f6591c;
            this.f7466aq = dei.m6235a(textView);
            this.f7467ar = textView.getScaleY();
            this.f7468as = textView.getTranslationX();
            this.f7469at = textView.getCurrentTextColor();
            TextView textView2 = watchNextInfoView.f6592d;
            this.f7470au = dei.m6235a(textView2);
            this.f7471av = textView2.getScaleX();
            this.f7472aw = textView2.getTranslationX();
            this.f7473ax = textView2.getTranslationY();
            this.f7474ay = textView2.getCurrentTextColor();
        }
        return this;
    }

    public final String toString() {
        String hexString = Integer.toHexString(hashCode());
        String valueOf = String.valueOf(this.f7476e);
        String valueOf2 = String.valueOf(this.f7484m);
        float f = this.f7477f;
        float f2 = this.f7479h;
        String valueOf3 = String.valueOf(this.f7485n);
        String valueOf4 = String.valueOf(this.f7486o);
        float f3 = this.f7487p;
        String valueOf5 = String.valueOf(this.f7488q);
        float f4 = this.f7489r;
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
        sb.append(f);
        sb.append(", pivotY=");
        sb.append(f2);
        sb.append(", previewImageContainerBounds=");
        sb.append(valueOf3);
        sb.append(", previewImageBackgroundBounds=");
        sb.append(valueOf4);
        sb.append(", previewImageBackgroundScale=");
        sb.append(f3);
        sb.append(", previewImageBounds=");
        sb.append(valueOf5);
        sb.append(", previewImageScale=");
        sb.append(f4);
        return sb.toString();
    }
}
