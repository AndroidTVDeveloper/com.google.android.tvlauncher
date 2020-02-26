package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.tvlauncher.appsview.BannerView;
import com.google.android.tvlauncher.home.view.ProgramView;
import com.google.android.tvlauncher.home.view.WatchNextInfoView;
import java.util.List;

/* renamed from: ctt  reason: default package */
/* compiled from: PG */
final class ctt extends AnimatorListenerAdapter {
    private final /* synthetic */ km a;
    private final /* synthetic */ ctu b;
    private final /* synthetic */ ctu c;
    private final /* synthetic */ ctv d;

    public ctt(ctv ctv, km kmVar, ctu ctu, ctu ctu2) {
        this.d = ctv;
        this.a = kmVar;
        this.b = ctu;
        this.c = ctu2;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        ImageView c2;
        List list;
        animator.removeListener(this);
        ctv ctv = this.d;
        int i = ctv.b;
        boolean remove = ctv.a.remove(animator);
        View view = this.a.a;
        if (view instanceof ProgramView) {
            ProgramView programView = (ProgramView) view;
            dei.a(programView, this.b.e);
            ctu ctu = this.b;
            programView.setPivotY(ctu.h);
            programView.setScaleX(ctu.f);
            programView.setScaleY(ctu.f);
            programView.setTranslationZ(0.0f);
            ImageView imageView = programView.c;
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            imageView.setTranslationY(0.0f);
            ctu ctu2 = this.b;
            dei.a(programView.b, ctu2.n);
            ImageView imageView2 = programView.d;
            imageView2.setScaleX(1.0f);
            imageView2.setScaleY(1.0f);
            imageView2.setTranslationX(0.0f);
            imageView2.setTranslationY(0.0f);
            float f = ctu2.az;
            if (f < 0.001f) {
                imageView2.setColorFilter((ColorFilter) null);
            } else {
                imageView2.setColorFilter(dej.b(-16777216, f));
            }
            View view2 = programView.g;
            view2.setTranslationX(0.0f);
            view2.setTranslationY(0.0f);
            View view3 = programView.i;
            view3.setScaleX(1.0f);
            view3.setTranslationY(0.0f);
            ProgressBar progressBar = programView.h;
            progressBar.setScaleX(1.0f);
            progressBar.setTranslationY(0.0f);
            ctu ctu3 = this.b;
            dei.a(programView.j, ctu3.G);
            View view4 = programView.m;
            view4.setScaleX(1.0f);
            view4.setTranslationY(0.0f);
            view4.setVisibility(ctu3.L);
            view4.setAlpha(1.0f);
            ImageView imageView3 = programView.k;
            imageView3.setTranslationY(0.0f);
            imageView3.setVisibility(ctu3.P);
            imageView3.setAlpha(1.0f);
            ctu ctu4 = this.b;
            ImageView imageView4 = programView.q;
            imageView4.setTranslationX(0.0f);
            imageView4.setTranslationY(0.0f);
            imageView4.setVisibility(ctu4.V);
            imageView4.setAlpha(1.0f);
            View view5 = (View) programView.o.getParent();
            view5.setTranslationX(0.0f);
            view5.setTranslationY(0.0f);
            TextView textView = programView.o;
            textView.setVisibility(ctu4.ab);
            textView.setAlpha(1.0f);
            TextView textView2 = programView.s;
            textView2.setVisibility(ctu4.ad);
            textView2.setAlpha(1.0f);
            if (!remove && !this.a.a.isFocused() && (list = this.c.m) != null && list.contains("PAYLOAD_FOCUS_CHANGED")) {
                km kmVar = this.a;
                if (kmVar instanceof con) {
                    ((con) kmVar).p.f();
                }
            }
        } else if (view instanceof cus) {
            cus cus = (cus) view;
            ctu ctu5 = this.b;
            View view6 = (View) cus;
            view6.setPivotX(ctu5.g);
            view6.setScaleX(ctu5.f);
            view6.setScaleY(ctu5.f);
            view6.setTranslationX(0.0f);
            view6.setTranslationY(0.0f);
            view6.setTranslationZ(0.0f);
            if (ctu5.az < 0.001f) {
                cus.a().setColorFilter((ColorFilter) null);
            } else {
                cus.a().setColorFilter(dej.b(-16777216, ctu5.az));
            }
            if ((cus instanceof BannerView) && (c2 = ((BannerView) cus).c()) != null) {
                float f2 = ctu5.aA;
                if (f2 < 0.001f) {
                    c2.setColorFilter((ColorFilter) null);
                } else {
                    c2.setColorFilter(dej.b(-16777216, f2));
                }
            }
            TextView d2 = cus.d();
            d2.setVisibility(ctu5.ag);
            d2.setAlpha(1.0f);
        } else if (view instanceof WatchNextInfoView) {
            WatchNextInfoView watchNextInfoView = (WatchNextInfoView) view;
            ctu ctu6 = this.b;
            dei.a(watchNextInfoView, ctu6.e);
            View view7 = watchNextInfoView.a;
            dei.a(view7, ctu6.ah);
            view7.setScaleX(ctu6.ai);
            view7.setScaleY(ctu6.ai);
            view7.setAlpha(ctu6.aj);
            dei.a(watchNextInfoView.a(), ctu6.ak);
            ImageView imageView5 = watchNextInfoView.b;
            imageView5.setScaleX(1.0f);
            imageView5.setScaleY(1.0f);
            imageView5.setTranslationY(0.0f);
            imageView5.setAlpha(ctu6.ap);
            TextView textView3 = watchNextInfoView.c;
            textView3.setScaleX(1.0f);
            textView3.setScaleY(1.0f);
            textView3.setTranslationX(0.0f);
            textView3.setTextColor(ctu6.at);
            TextView textView4 = watchNextInfoView.d;
            textView4.setScaleX(ctu6.av);
            textView4.setScaleY(ctu6.av);
            textView4.setTranslationX(0.0f);
            textView4.setTranslationY(0.0f);
            textView4.setTextColor(ctu6.ay);
        }
        this.d.e(this.a);
        this.d.c.remove(this.a);
        this.d.c();
    }
}
