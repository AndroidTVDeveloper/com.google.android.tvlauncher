package p000;

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

/* renamed from: ctt */
/* compiled from: PG */
final class ctt extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ C0285km f7419a;

    /* renamed from: b */
    private final /* synthetic */ ctu f7420b;

    /* renamed from: c */
    private final /* synthetic */ ctu f7421c;

    /* renamed from: d */
    private final /* synthetic */ ctv f7422d;

    public ctt(ctv ctv, C0285km kmVar, ctu ctu, ctu ctu2) {
        this.f7422d = ctv;
        this.f7419a = kmVar;
        this.f7420b = ctu;
        this.f7421c = ctu2;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        ImageView c;
        List list;
        animator.removeListener(this);
        ctv ctv = this.f7422d;
        int i = ctv.f7498b;
        boolean remove = ctv.f7501a.remove(animator);
        View view = this.f7419a.f9783a;
        if (view instanceof ProgramView) {
            ProgramView programView = (ProgramView) view;
            dei.m6237a(programView, this.f7420b.f7476e);
            ctu ctu = this.f7420b;
            programView.setPivotY(ctu.f7479h);
            programView.setScaleX(ctu.f7477f);
            programView.setScaleY(ctu.f7477f);
            programView.setTranslationZ(0.0f);
            ImageView imageView = programView.f6567c;
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            imageView.setTranslationY(0.0f);
            ctu ctu2 = this.f7420b;
            dei.m6237a(programView.f6566b, ctu2.f7485n);
            ImageView imageView2 = programView.f6568d;
            imageView2.setScaleX(1.0f);
            imageView2.setScaleY(1.0f);
            imageView2.setTranslationX(0.0f);
            imageView2.setTranslationY(0.0f);
            float f = ctu2.f7475az;
            if (f < 0.001f) {
                imageView2.setColorFilter((ColorFilter) null);
            } else {
                imageView2.setColorFilter(dej.m6252b(-16777216, f));
            }
            View view2 = programView.f6571g;
            view2.setTranslationX(0.0f);
            view2.setTranslationY(0.0f);
            View view3 = programView.f6573i;
            view3.setScaleX(1.0f);
            view3.setTranslationY(0.0f);
            ProgressBar progressBar = programView.f6572h;
            progressBar.setScaleX(1.0f);
            progressBar.setTranslationY(0.0f);
            ctu ctu3 = this.f7420b;
            dei.m6237a(programView.f6574j, ctu3.f7429G);
            View view4 = programView.f6577m;
            view4.setScaleX(1.0f);
            view4.setTranslationY(0.0f);
            view4.setVisibility(ctu3.f7434L);
            view4.setAlpha(1.0f);
            ImageView imageView3 = programView.f6575k;
            imageView3.setTranslationY(0.0f);
            imageView3.setVisibility(ctu3.f7438P);
            imageView3.setAlpha(1.0f);
            ctu ctu4 = this.f7420b;
            ImageView imageView4 = programView.f6581q;
            imageView4.setTranslationX(0.0f);
            imageView4.setTranslationY(0.0f);
            imageView4.setVisibility(ctu4.f7444V);
            imageView4.setAlpha(1.0f);
            View view5 = (View) programView.f6579o.getParent();
            view5.setTranslationX(0.0f);
            view5.setTranslationY(0.0f);
            TextView textView = programView.f6579o;
            textView.setVisibility(ctu4.f7451ab);
            textView.setAlpha(1.0f);
            TextView textView2 = programView.f6583s;
            textView2.setVisibility(ctu4.f7453ad);
            textView2.setAlpha(1.0f);
            if (!remove && !this.f7419a.f9783a.isFocused() && (list = this.f7421c.f7484m) != null && list.contains("PAYLOAD_FOCUS_CHANGED")) {
                C0285km kmVar = this.f7419a;
                if (kmVar instanceof con) {
                    ((con) kmVar).f6780p.mo3685f();
                }
            }
        } else if (view instanceof cus) {
            cus cus = (cus) view;
            ctu ctu5 = this.f7420b;
            View view6 = (View) cus;
            view6.setPivotX(ctu5.f7478g);
            view6.setScaleX(ctu5.f7477f);
            view6.setScaleY(ctu5.f7477f);
            view6.setTranslationX(0.0f);
            view6.setTranslationY(0.0f);
            view6.setTranslationZ(0.0f);
            if (ctu5.f7475az < 0.001f) {
                cus.mo3223a().setColorFilter((ColorFilter) null);
            } else {
                cus.mo3223a().setColorFilter(dej.m6252b(-16777216, ctu5.f7475az));
            }
            if ((cus instanceof BannerView) && (c = ((BannerView) cus).mo3229c()) != null) {
                float f2 = ctu5.f7449aA;
                if (f2 < 0.001f) {
                    c.setColorFilter((ColorFilter) null);
                } else {
                    c.setColorFilter(dej.m6252b(-16777216, f2));
                }
            }
            TextView d = cus.mo3230d();
            d.setVisibility(ctu5.f7456ag);
            d.setAlpha(1.0f);
        } else if (view instanceof WatchNextInfoView) {
            WatchNextInfoView watchNextInfoView = (WatchNextInfoView) view;
            ctu ctu6 = this.f7420b;
            dei.m6237a(watchNextInfoView, ctu6.f7476e);
            View view7 = watchNextInfoView.f6589a;
            dei.m6237a(view7, ctu6.f7457ah);
            view7.setScaleX(ctu6.f7458ai);
            view7.setScaleY(ctu6.f7458ai);
            view7.setAlpha(ctu6.f7459aj);
            dei.m6237a(watchNextInfoView.mo3418a(), ctu6.f7460ak);
            ImageView imageView5 = watchNextInfoView.f6590b;
            imageView5.setScaleX(1.0f);
            imageView5.setScaleY(1.0f);
            imageView5.setTranslationY(0.0f);
            imageView5.setAlpha(ctu6.f7465ap);
            TextView textView3 = watchNextInfoView.f6591c;
            textView3.setScaleX(1.0f);
            textView3.setScaleY(1.0f);
            textView3.setTranslationX(0.0f);
            textView3.setTextColor(ctu6.f7469at);
            TextView textView4 = watchNextInfoView.f6592d;
            textView4.setScaleX(ctu6.f7471av);
            textView4.setScaleY(ctu6.f7471av);
            textView4.setTranslationX(0.0f);
            textView4.setTranslationY(0.0f);
            textView4.setTextColor(ctu6.f7474ay);
        }
        this.f7422d.mo5324e(this.f7419a);
        this.f7422d.f8386c.remove(this.f7419a);
        this.f7422d.mo4193c();
    }
}
