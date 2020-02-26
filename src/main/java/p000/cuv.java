package p000;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.tvlauncher.home.view.ChannelView;
import com.google.android.tvlauncher.home.view.ConfigureChannelsRowView;
import com.google.android.tvlauncher.notifications.NotificationsTrayView;
import com.google.android.tvlauncher.view.HomeTopRowView;
import com.google.android.tvlauncher.view.SearchOrb;
import com.google.android.tvlauncher.view.SearchView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cuv */
/* compiled from: PG */
final class cuv extends C0265jt {

    /* renamed from: A */
    public int f7523A;

    /* renamed from: B */
    public float f7524B;

    /* renamed from: C */
    public int f7525C;

    /* renamed from: D */
    public int f7526D;

    /* renamed from: E */
    public float f7527E;

    /* renamed from: F */
    public float f7528F;

    /* renamed from: G */
    public int f7529G;

    /* renamed from: H */
    public float f7530H;

    /* renamed from: I */
    public int f7531I;

    /* renamed from: J */
    public int f7532J;

    /* renamed from: K */
    public int f7533K;

    /* renamed from: L */
    public int f7534L;

    /* renamed from: M */
    public float f7535M;

    /* renamed from: N */
    public float f7536N;

    /* renamed from: O */
    public int f7537O;

    /* renamed from: P */
    public float f7538P;

    /* renamed from: Q */
    public int f7539Q;

    /* renamed from: R */
    public int f7540R;

    /* renamed from: S */
    public int f7541S;

    /* renamed from: T */
    public float f7542T;

    /* renamed from: U */
    public int f7543U;

    /* renamed from: V */
    public float f7544V;

    /* renamed from: W */
    public int f7545W;

    /* renamed from: X */
    public float f7546X;

    /* renamed from: Y */
    public int f7547Y;

    /* renamed from: Z */
    public int f7548Z;

    /* renamed from: aA */
    public int f7549aA;

    /* renamed from: aB */
    public float f7550aB;

    /* renamed from: aC */
    public int f7551aC;

    /* renamed from: aD */
    public float f7552aD;

    /* renamed from: aE */
    public float f7553aE;

    /* renamed from: aF */
    public int f7554aF;

    /* renamed from: aG */
    public int[] f7555aG;

    /* renamed from: aH */
    public int[] f7556aH;

    /* renamed from: aI */
    public float[] f7557aI;

    /* renamed from: aJ */
    public float[] f7558aJ;

    /* renamed from: aK */
    public int f7559aK;

    /* renamed from: aL */
    public float f7560aL;

    /* renamed from: aM */
    public int f7561aM;

    /* renamed from: aN */
    public float f7562aN;

    /* renamed from: aa */
    public int f7563aa;

    /* renamed from: ab */
    public float f7564ab;

    /* renamed from: ac */
    public int f7565ac;

    /* renamed from: ad */
    public int f7566ad;

    /* renamed from: ae */
    public float f7567ae;

    /* renamed from: af */
    public float f7568af;

    /* renamed from: ag */
    public int f7569ag;

    /* renamed from: ah */
    public float f7570ah;

    /* renamed from: ai */
    public int f7571ai;

    /* renamed from: aj */
    public int f7572aj;

    /* renamed from: ak */
    public float f7573ak;

    /* renamed from: al */
    public float f7574al;

    /* renamed from: am */
    public int f7575am;

    /* renamed from: an */
    public float f7576an;

    /* renamed from: ao */
    public int f7577ao;

    /* renamed from: ap */
    public float f7578ap;

    /* renamed from: aq */
    public int f7579aq;

    /* renamed from: ar */
    public float f7580ar;

    /* renamed from: as */
    public int f7581as;

    /* renamed from: at */
    public float f7582at;

    /* renamed from: au */
    public int f7583au;

    /* renamed from: av */
    public int f7584av;

    /* renamed from: aw */
    public float f7585aw;

    /* renamed from: ax */
    public float f7586ax;

    /* renamed from: ay */
    public int f7587ay;

    /* renamed from: az */
    public float f7588az;

    /* renamed from: e */
    public Rect f7589e;

    /* renamed from: f */
    public Rect f7590f;

    /* renamed from: g */
    public final List f7591g = new ArrayList(5);

    /* renamed from: h */
    public int f7592h;

    /* renamed from: i */
    public float f7593i;

    /* renamed from: j */
    public int f7594j;

    /* renamed from: k */
    public int f7595k;

    /* renamed from: l */
    public float f7596l;

    /* renamed from: m */
    public float f7597m;

    /* renamed from: n */
    public int f7598n;

    /* renamed from: o */
    public int f7599o;

    /* renamed from: p */
    public float f7600p;

    /* renamed from: q */
    public float f7601q;

    /* renamed from: r */
    public int f7602r;

    /* renamed from: s */
    public float f7603s;

    /* renamed from: t */
    public int f7604t;

    /* renamed from: u */
    public Rect f7605u;

    /* renamed from: v */
    public Rect f7606v;

    /* renamed from: w */
    public float f7607w;

    /* renamed from: x */
    public float f7608x;

    /* renamed from: y */
    public float f7609y;

    /* renamed from: z */
    public float f7610z;

    private cuv() {
    }

    public /* synthetic */ cuv(byte b) {
    }

    /* renamed from: a */
    public final C0265jt mo3742a(C0285km kmVar) {
        super.mo3742a(kmVar);
        this.f7589e = dei.m6235a(kmVar.f9783a);
        View view = kmVar.f9783a;
        if (view instanceof ChannelView) {
            ChannelView channelView = (ChannelView) view;
            HorizontalGridView horizontalGridView = channelView.f6517b;
            this.f7590f = dei.m6235a(horizontalGridView);
            ViewParent parent = horizontalGridView.getParent();
            while (true) {
                View view2 = (View) parent;
                if (view2 == kmVar.f9783a) {
                    break;
                }
                this.f7591g.add(dei.m6235a(view2));
                parent = view2.getParent();
            }
            TextView textView = channelView.f6525j;
            this.f7592h = channelView.f6528m;
            this.f7593i = textView.getAlpha();
            this.f7594j = textView.getLeft();
            this.f7595k = textView.getTop();
            this.f7596l = textView.getTranslationX();
            this.f7597m = textView.getTranslationY();
            ImageView imageView = channelView.f6523h;
            this.f7606v = dei.m6235a(imageView);
            this.f7607w = imageView.getTranslationX();
            this.f7608x = imageView.getTranslationY();
            this.f7609y = imageView.getTranslationZ();
            this.f7610z = imageView.getScaleX();
            this.f7523A = (int) imageView.getElevation();
            this.f7605u = dei.m6235a((View) imageView.getParent());
            this.f7524B = channelView.f6524i;
            View view3 = channelView.f6531p;
            this.f7598n = view3.getHeight();
            this.f7599o = view3.getTop();
            this.f7600p = view3.getTranslationY();
            this.f7601q = view3.getScaleY();
            this.f7604t = ((ColorDrawable) view3.getBackground()).getColor();
            this.f7602r = channelView.f6532q;
            this.f7603s = view3.getAlpha();
            TextView textView2 = channelView.f6518c;
            this.f7525C = textView2.getLeft();
            this.f7526D = textView2.getTop();
            this.f7527E = textView2.getTranslationX();
            this.f7528F = textView2.getTranslationY();
            this.f7529G = channelView.f6519d;
            this.f7530H = textView2.getAlpha();
            this.f7531I = channelView.f6538w;
            this.f7532J = textView2.getCurrentTextColor();
            TextView textView3 = channelView.f6520e;
            this.f7533K = textView3.getLeft();
            this.f7534L = textView3.getTop();
            this.f7535M = textView3.getTranslationX();
            this.f7536N = textView3.getTranslationY();
            this.f7537O = channelView.f6521f;
            this.f7538P = textView3.getAlpha();
            this.f7539Q = channelView.f6539x;
            this.f7540R = textView3.getCurrentTextColor();
            TextView textView4 = channelView.f6522g;
            this.f7541S = textView4.getLeft();
            this.f7542T = textView4.getTranslationX();
            this.f7543U = textView4.getTop();
            this.f7544V = textView4.getTranslationY();
            this.f7545W = textView4.getVisibility();
            this.f7546X = textView4.getAlpha();
            this.f7547Y = channelView.f6537v;
            this.f7548Z = textView4.getCurrentTextColor();
            this.f7563aa = channelView.f6530o;
            this.f7564ab = channelView.f6529n.getAlpha();
            View view4 = channelView.f6526k;
            this.f7565ac = view4.getLeft();
            this.f7566ad = view4.getTop();
            this.f7567ae = view4.getTranslationX();
            this.f7568af = view4.getTranslationY();
            this.f7569ag = channelView.f6527l;
            this.f7570ah = view4.getAlpha();
            View view5 = channelView.f6533r;
            this.f7571ai = view5.getLeft();
            this.f7572aj = view5.getTop();
            this.f7573ak = view5.getTranslationX();
            this.f7574al = view5.getTranslationY();
            this.f7575am = channelView.f6534s;
            this.f7576an = view5.getAlpha();
        } else {
            if (view instanceof HomeTopRowView) {
                HomeTopRowView homeTopRowView = (HomeTopRowView) view;
                ViewGroup viewGroup = homeTopRowView.f6701d;
                SearchView searchView = homeTopRowView.f6702e;
                this.f7577ao = viewGroup.getTop();
                this.f7578ap = viewGroup.getTranslationY();
                NotificationsTrayView notificationsTrayView = homeTopRowView.f6703f;
                this.f7579aq = notificationsTrayView.getTop();
                this.f7580ar = notificationsTrayView.getTranslationY();
                this.f7581as = viewGroup.getChildAt(0).getLeft();
                this.f7582at = viewGroup.getChildAt(0).getTranslationX();
                SearchOrb searchOrb = searchView.f6747d;
                SearchOrb searchOrb2 = searchView.f6748e;
                this.f7583au = ((ColorDrawable) searchOrb.f6724a.getBackground()).getColor();
                this.f7585aw = searchOrb.getScaleX();
                this.f7584av = ((ColorDrawable) searchOrb2.f6724a.getBackground()).getColor();
                this.f7586ax = searchOrb2.getScaleX();
                this.f7587ay = searchView.f6755l;
                this.f7588az = searchView.f6748e.getAlpha();
                LinearLayout linearLayout = searchView.f6751h;
                TextSwitcher textSwitcher = searchView.f6750g;
                ImageView imageView2 = searchView.f6749f;
                this.f7549aA = searchView.f6756m;
                this.f7550aB = imageView2.getAlpha();
                this.f7551aC = textSwitcher.getLeft();
                this.f7552aD = textSwitcher.getTranslationX();
                this.f7553aE = linearLayout.getTranslationX();
                this.f7554aF = linearLayout.getLeft();
            } else if (view instanceof ConfigureChannelsRowView) {
                ConfigureChannelsRowView configureChannelsRowView = (ConfigureChannelsRowView) view;
                this.f7555aG = new int[configureChannelsRowView.getChildCount()];
                this.f7556aH = new int[configureChannelsRowView.getChildCount()];
                this.f7557aI = new float[configureChannelsRowView.getChildCount()];
                this.f7558aJ = new float[configureChannelsRowView.getChildCount()];
                for (int i = 0; i < configureChannelsRowView.getChildCount(); i++) {
                    View childAt = configureChannelsRowView.getChildAt(i);
                    this.f7555aG[i] = childAt.getLeft();
                    this.f7556aH[i] = childAt.getTop();
                    this.f7557aI[i] = childAt.getTranslationX();
                    this.f7558aJ[i] = childAt.getTranslationY();
                }
                this.f7559aK = configureChannelsRowView.f6556c;
                this.f7560aL = configureChannelsRowView.f6555b.getAlpha();
                this.f7561aM = ((ColorDrawable) configureChannelsRowView.f6554a.getBackground()).getColor();
                this.f7562aN = configureChannelsRowView.f6554a.getScaleX();
            }
        }
        return this;
    }

    public final String toString() {
        int i = this.f9700a;
        int i2 = this.f9701b;
        int i3 = this.f9702c;
        int i4 = this.f9703d;
        String valueOf = String.valueOf(this.f7590f);
        String valueOf2 = String.valueOf(this.f7591g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 130 + String.valueOf(valueOf2).length());
        sb.append("MyHolderInfo left=");
        sb.append(i);
        sb.append(", top=");
        sb.append(i2);
        sb.append(", right=");
        sb.append(i3);
        sb.append(", bottom=");
        sb.append(i4);
        sb.append(", itemsListBounds=");
        sb.append(valueOf);
        sb.append(", itemsListContainerBounds=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
