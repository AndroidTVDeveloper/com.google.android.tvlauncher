package defpackage;

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

/* renamed from: cuv  reason: default package */
/* compiled from: PG */
final class cuv extends jt {
    public int A;
    public float B;
    public int C;
    public int D;
    public float E;
    public float F;
    public int G;
    public float H;
    public int I;
    public int J;
    public int K;
    public int L;
    public float M;
    public float N;
    public int O;
    public float P;
    public int Q;
    public int R;
    public int S;
    public float T;
    public int U;
    public float V;
    public int W;
    public float X;
    public int Y;
    public int Z;
    public int aA;
    public float aB;
    public int aC;
    public float aD;
    public float aE;
    public int aF;
    public int[] aG;
    public int[] aH;
    public float[] aI;
    public float[] aJ;
    public int aK;
    public float aL;
    public int aM;
    public float aN;
    public int aa;
    public float ab;
    public int ac;
    public int ad;
    public float ae;
    public float af;
    public int ag;
    public float ah;
    public int ai;
    public int aj;
    public float ak;
    public float al;
    public int am;
    public float an;
    public int ao;
    public float ap;
    public int aq;
    public float ar;
    public int as;
    public float at;
    public int au;
    public int av;
    public float aw;
    public float ax;
    public int ay;
    public float az;
    public Rect e;
    public Rect f;
    public final List g = new ArrayList(5);
    public int h;
    public float i;
    public int j;
    public int k;
    public float l;
    public float m;
    public int n;
    public int o;
    public float p;
    public float q;
    public int r;
    public float s;
    public int t;
    public Rect u;
    public Rect v;
    public float w;
    public float x;
    public float y;
    public float z;

    private cuv() {
    }

    public /* synthetic */ cuv(byte b) {
    }

    public final jt a(km kmVar) {
        super.a(kmVar);
        this.e = dei.a(kmVar.a);
        View view = kmVar.a;
        if (view instanceof ChannelView) {
            ChannelView channelView = (ChannelView) view;
            HorizontalGridView horizontalGridView = channelView.b;
            this.f = dei.a(horizontalGridView);
            ViewParent parent = horizontalGridView.getParent();
            while (true) {
                View view2 = (View) parent;
                if (view2 == kmVar.a) {
                    break;
                }
                this.g.add(dei.a(view2));
                parent = view2.getParent();
            }
            TextView textView = channelView.j;
            this.h = channelView.m;
            this.i = textView.getAlpha();
            this.j = textView.getLeft();
            this.k = textView.getTop();
            this.l = textView.getTranslationX();
            this.m = textView.getTranslationY();
            ImageView imageView = channelView.h;
            this.v = dei.a(imageView);
            this.w = imageView.getTranslationX();
            this.x = imageView.getTranslationY();
            this.y = imageView.getTranslationZ();
            this.z = imageView.getScaleX();
            this.A = (int) imageView.getElevation();
            this.u = dei.a((View) imageView.getParent());
            this.B = channelView.i;
            View view3 = channelView.p;
            this.n = view3.getHeight();
            this.o = view3.getTop();
            this.p = view3.getTranslationY();
            this.q = view3.getScaleY();
            this.t = ((ColorDrawable) view3.getBackground()).getColor();
            this.r = channelView.q;
            this.s = view3.getAlpha();
            TextView textView2 = channelView.c;
            this.C = textView2.getLeft();
            this.D = textView2.getTop();
            this.E = textView2.getTranslationX();
            this.F = textView2.getTranslationY();
            this.G = channelView.d;
            this.H = textView2.getAlpha();
            this.I = channelView.w;
            this.J = textView2.getCurrentTextColor();
            TextView textView3 = channelView.e;
            this.K = textView3.getLeft();
            this.L = textView3.getTop();
            this.M = textView3.getTranslationX();
            this.N = textView3.getTranslationY();
            this.O = channelView.f;
            this.P = textView3.getAlpha();
            this.Q = channelView.x;
            this.R = textView3.getCurrentTextColor();
            TextView textView4 = channelView.g;
            this.S = textView4.getLeft();
            this.T = textView4.getTranslationX();
            this.U = textView4.getTop();
            this.V = textView4.getTranslationY();
            this.W = textView4.getVisibility();
            this.X = textView4.getAlpha();
            this.Y = channelView.v;
            this.Z = textView4.getCurrentTextColor();
            this.aa = channelView.o;
            this.ab = channelView.n.getAlpha();
            View view4 = channelView.k;
            this.ac = view4.getLeft();
            this.ad = view4.getTop();
            this.ae = view4.getTranslationX();
            this.af = view4.getTranslationY();
            this.ag = channelView.l;
            this.ah = view4.getAlpha();
            View view5 = channelView.r;
            this.ai = view5.getLeft();
            this.aj = view5.getTop();
            this.ak = view5.getTranslationX();
            this.al = view5.getTranslationY();
            this.am = channelView.s;
            this.an = view5.getAlpha();
        } else {
            if (view instanceof HomeTopRowView) {
                HomeTopRowView homeTopRowView = (HomeTopRowView) view;
                ViewGroup viewGroup = homeTopRowView.d;
                SearchView searchView = homeTopRowView.e;
                this.ao = viewGroup.getTop();
                this.ap = viewGroup.getTranslationY();
                NotificationsTrayView notificationsTrayView = homeTopRowView.f;
                this.aq = notificationsTrayView.getTop();
                this.ar = notificationsTrayView.getTranslationY();
                this.as = viewGroup.getChildAt(0).getLeft();
                this.at = viewGroup.getChildAt(0).getTranslationX();
                SearchOrb searchOrb = searchView.d;
                SearchOrb searchOrb2 = searchView.e;
                this.au = ((ColorDrawable) searchOrb.a.getBackground()).getColor();
                this.aw = searchOrb.getScaleX();
                this.av = ((ColorDrawable) searchOrb2.a.getBackground()).getColor();
                this.ax = searchOrb2.getScaleX();
                this.ay = searchView.l;
                this.az = searchView.e.getAlpha();
                LinearLayout linearLayout = searchView.h;
                TextSwitcher textSwitcher = searchView.g;
                ImageView imageView2 = searchView.f;
                this.aA = searchView.m;
                this.aB = imageView2.getAlpha();
                this.aC = textSwitcher.getLeft();
                this.aD = textSwitcher.getTranslationX();
                this.aE = linearLayout.getTranslationX();
                this.aF = linearLayout.getLeft();
            } else if (view instanceof ConfigureChannelsRowView) {
                ConfigureChannelsRowView configureChannelsRowView = (ConfigureChannelsRowView) view;
                this.aG = new int[configureChannelsRowView.getChildCount()];
                this.aH = new int[configureChannelsRowView.getChildCount()];
                this.aI = new float[configureChannelsRowView.getChildCount()];
                this.aJ = new float[configureChannelsRowView.getChildCount()];
                for (int i2 = 0; i2 < configureChannelsRowView.getChildCount(); i2++) {
                    View childAt = configureChannelsRowView.getChildAt(i2);
                    this.aG[i2] = childAt.getLeft();
                    this.aH[i2] = childAt.getTop();
                    this.aI[i2] = childAt.getTranslationX();
                    this.aJ[i2] = childAt.getTranslationY();
                }
                this.aK = configureChannelsRowView.c;
                this.aL = configureChannelsRowView.b.getAlpha();
                this.aM = ((ColorDrawable) configureChannelsRowView.a.getBackground()).getColor();
                this.aN = configureChannelsRowView.a.getScaleX();
            }
        }
        return this;
    }

    public final String toString() {
        int i2 = this.a;
        int i3 = this.b;
        int i4 = this.c;
        int i5 = this.d;
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 130 + String.valueOf(valueOf2).length());
        sb.append("MyHolderInfo left=");
        sb.append(i2);
        sb.append(", top=");
        sb.append(i3);
        sb.append(", right=");
        sb.append(i4);
        sb.append(", bottom=");
        sb.append(i5);
        sb.append(", itemsListBounds=");
        sb.append(valueOf);
        sb.append(", itemsListContainerBounds=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
