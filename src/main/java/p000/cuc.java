package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: cuc */
/* compiled from: PG */
public final /* synthetic */ class cuc implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a */
    private final ChannelView f7510a;

    public cuc(ChannelView channelView) {
        this.f7510a = channelView;
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        cuq cuq;
        ChannelView channelView = this.f7510a;
        boolean a = channelView.mo3380a(view);
        boolean a2 = channelView.mo3380a(view2);
        if (a2 != a) {
            Integer num = null;
            if (a2) {
                switch (channelView.f6450A) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 17:
                        num = 0;
                        break;
                    case 9:
                        num = 8;
                        break;
                    case 11:
                    case 12:
                        num = 10;
                        break;
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 32:
                        num = 18;
                        break;
                    case 26:
                        num = 25;
                        break;
                    case 28:
                    case 29:
                        num = 27;
                        break;
                }
            } else {
                int i = channelView.f6450A;
                if (i == 0) {
                    num = 1;
                } else if (i == 8) {
                    num = 9;
                } else if (i == 10) {
                    num = 11;
                } else if (i == 18) {
                    num = 19;
                } else if (i == 25) {
                    num = 26;
                } else if (i == 27) {
                    num = 28;
                }
            }
            if (num != null && (cuq = channelView.f6464O) != null) {
                cuq.mo3521c(num.intValue());
            }
        }
    }
}
