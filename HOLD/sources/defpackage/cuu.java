package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.tvlauncher.home.view.ChannelView;
import com.google.android.tvlauncher.home.view.ConfigureChannelsRowView;
import com.google.android.tvlauncher.view.HomeTopRowView;
import com.google.android.tvlauncher.view.SearchOrb;
import com.google.android.tvlauncher.view.SearchView;

/* renamed from: cuu  reason: default package */
/* compiled from: PG */
final class cuu extends AnimatorListenerAdapter {
    private final /* synthetic */ km a;
    private final /* synthetic */ cuv b;
    private final /* synthetic */ cuw c;

    public cuu(cuw cuw, km kmVar, cuv cuv) {
        this.c = cuw;
        this.a = kmVar;
        this.b = cuv;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        animator.removeListener(this);
        dei.a(this.a.a, this.b.e);
        View view = this.a.a;
        int i = 0;
        if (view instanceof ChannelView) {
            ChannelView channelView = (ChannelView) view;
            cuv cuv = this.b;
            HorizontalGridView horizontalGridView = channelView.b;
            dei.a(horizontalGridView, cuv.f);
            View view2 = (View) horizontalGridView.getParent();
            while (i < cuv.g.size()) {
                dei.a(view2, (Rect) cuv.g.get(i));
                view2 = (View) view2.getParent();
                i++;
            }
            cuv cuv2 = this.b;
            TextView textView = channelView.j;
            textView.setVisibility(cuv2.h);
            textView.setAlpha(1.0f);
            textView.setTranslationX(0.0f);
            textView.setTranslationY(0.0f);
            if (channelView.G) {
                cuv cuv3 = this.b;
                ImageView imageView = channelView.h;
                imageView.setTranslationX(0.0f);
                imageView.setTranslationY(0.0f);
                imageView.setScaleX(1.0f);
                imageView.setScaleY(1.0f);
                View view3 = channelView.p;
                view3.setScaleY(1.0f);
                view3.setTranslationY(0.0f);
                view3.setBackgroundColor(cuv3.t);
                view3.setVisibility(cuv3.r);
                view3.setAlpha(1.0f);
            } else {
                cuv cuv4 = this.b;
                ImageView imageView2 = channelView.h;
                dei.a((View) imageView2.getParent(), cuv4.u);
                imageView2.setScaleX(1.0f);
                imageView2.setScaleY(1.0f);
                imageView2.setTranslationZ(0.0f);
                imageView2.setTranslationX(0.0f);
                imageView2.setTranslationY(0.0f);
                float f = cuv4.B;
                if (f < 0.001f) {
                    imageView2.setColorFilter((ColorFilter) null);
                } else {
                    imageView2.setColorFilter(dej.b(-16777216, f));
                }
            }
            cuv cuv5 = this.b;
            TextView textView2 = channelView.c;
            textView2.setTranslationY(0.0f);
            textView2.setTranslationX(0.0f);
            textView2.setVisibility(cuv5.G);
            textView2.setAlpha(1.0f);
            textView2.setTextColor(cuv5.I);
            TextView textView3 = channelView.e;
            textView3.setTranslationX(0.0f);
            textView3.setTranslationY(0.0f);
            textView3.setVisibility(cuv5.O);
            textView3.setAlpha(1.0f);
            textView3.setTextColor(cuv5.Q);
            TextView textView4 = channelView.g;
            textView4.setTranslationX(0.0f);
            textView4.setVisibility(cuv5.W);
            textView4.setAlpha(1.0f);
            textView4.setTextColor(cuv5.Y);
            View view4 = channelView.k;
            view4.setTranslationX(0.0f);
            view4.setTranslationY(0.0f);
            view4.setVisibility(cuv5.ag);
            view4.setAlpha(1.0f);
            cuv cuv6 = this.b;
            View view5 = channelView.r;
            view5.setTranslationX(0.0f);
            view5.setTranslationY(0.0f);
            view5.setVisibility(cuv6.am);
            view5.setAlpha(1.0f);
            View view6 = channelView.n;
            view6.setVisibility(this.b.aa);
            view6.setAlpha(1.0f);
        } else if (view instanceof HomeTopRowView) {
            HomeTopRowView homeTopRowView = (HomeTopRowView) view;
            cuv cuv7 = this.b;
            ViewGroup viewGroup = homeTopRowView.d;
            viewGroup.setTranslationY(0.0f);
            viewGroup.getChildAt(0).setTranslationX(0.0f);
            homeTopRowView.f.setTranslationY(0.0f);
            SearchView searchView = homeTopRowView.e;
            SearchOrb searchOrb = searchView.d;
            SearchOrb searchOrb2 = searchView.e;
            searchOrb.a.setBackgroundColor(cuv7.au);
            searchOrb2.a.setBackgroundColor(cuv7.av);
            ImageView imageView3 = searchView.f;
            imageView3.setVisibility(cuv7.aA);
            imageView3.setAlpha(1.0f);
            searchOrb2.setScaleX(cuv7.ax);
            searchOrb2.setScaleY(cuv7.ax);
            searchOrb2.setVisibility(cuv7.ay);
            searchOrb2.setAlpha(1.0f);
            searchOrb.setScaleX(cuv7.aw);
            searchOrb.setScaleY(cuv7.aw);
            searchView.g.setTranslationX(0.0f);
            searchView.h.setTranslationX(0.0f);
        } else if (view instanceof ConfigureChannelsRowView) {
            ConfigureChannelsRowView configureChannelsRowView = (ConfigureChannelsRowView) view;
            cuv cuv8 = this.b;
            while (i < configureChannelsRowView.getChildCount()) {
                configureChannelsRowView.getChildAt(i).setTranslationX(0.0f);
                configureChannelsRowView.getChildAt(i).setTranslationY(0.0f);
                i++;
            }
            configureChannelsRowView.b.setVisibility(cuv8.aK);
            configureChannelsRowView.b.setAlpha(1.0f);
            TextView textView5 = configureChannelsRowView.a;
            textView5.setBackgroundColor(cuv8.aM);
            textView5.setScaleX(cuv8.aN);
            textView5.setScaleY(cuv8.aN);
        }
        this.c.e(this.a);
        this.c.c.remove(this.a);
        this.c.c();
    }
}
