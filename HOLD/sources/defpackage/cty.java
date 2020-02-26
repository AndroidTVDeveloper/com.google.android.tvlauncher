package defpackage;

import android.media.AudioManager;
import android.view.View;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: cty  reason: default package */
/* compiled from: PG */
public final /* synthetic */ class cty implements View.OnClickListener {
    private final ChannelView a;

    public cty(ChannelView channelView) {
        this.a = channelView;
    }

    public final void onClick(View view) {
        ChannelView channelView = this.a;
        cuo cuo = channelView.J;
        if (cuo == null) {
            AudioManager audioManager = (AudioManager) channelView.getContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(9);
                return;
            }
            return;
        }
        cuo.a(channelView);
    }
}
