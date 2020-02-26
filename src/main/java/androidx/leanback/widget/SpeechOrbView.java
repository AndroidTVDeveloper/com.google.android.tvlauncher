package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class SpeechOrbView extends SearchOrbView {

    /* renamed from: c */
    private C0399os f1293c;

    public SpeechOrbView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final int mo1048a() {
        return R.layout.lb_speech_orb;
    }

    public SpeechOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpeechOrbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        resources.getFraction(R.fraction.lb_search_bar_speech_orb_max_level_zoom, 1, 1);
        this.f1293c = new C0399os(resources.getColor(R.color.lb_speech_orb_not_recording), resources.getColor(R.color.lb_speech_orb_not_recording_pulsed), resources.getColor(R.color.lb_speech_orb_not_recording_icon));
        new C0399os(resources.getColor(R.color.lb_speech_orb_recording), resources.getColor(R.color.lb_speech_orb_recording), 0);
        mo1052a(this.f1293c);
        mo1051a(getResources().getDrawable(R.drawable.lb_ic_search_mic_out));
        mo1053a(hasFocus());
        this.f1265b.setScaleX(1.0f);
        this.f1265b.setScaleY(1.0f);
    }
}
