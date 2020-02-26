package p000;

import android.media.AudioManager;
import android.view.View;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: cty */
/* compiled from: PG */
public final /* synthetic */ class cty implements View.OnClickListener {

    /* renamed from: a */
    private final ChannelView f7505a;

    public cty(ChannelView channelView) {
        this.f7505a = channelView;
    }

    public final void onClick(View view) {
        ChannelView channelView = this.f7505a;
        cuo cuo = channelView.f6459J;
        if (cuo == null) {
            AudioManager audioManager = (AudioManager) channelView.getContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(9);
                return;
            }
            return;
        }
        cuo.mo3516a(channelView);
    }
}
