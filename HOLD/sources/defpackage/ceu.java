package defpackage;

import android.content.BroadcastReceiver;

/* renamed from: ceu  reason: default package */
/* compiled from: PG */
public final class ceu implements bwx {
    private final /* synthetic */ BroadcastReceiver.PendingResult a;

    public ceu(BroadcastReceiver.PendingResult pendingResult) {
        this.a = pendingResult;
    }

    public final void a() {
        this.a.finish();
    }
}
