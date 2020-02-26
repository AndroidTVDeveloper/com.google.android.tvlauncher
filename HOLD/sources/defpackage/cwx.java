package defpackage;

import android.media.tv.TvView;

/* renamed from: cwx  reason: default package */
/* compiled from: PG */
final class cwx extends TvView.TimeShiftPositionCallback {
    private final /* synthetic */ cwz a;

    public cwx(cwz cwz) {
        this.a = cwz;
    }

    public final void onTimeShiftCurrentPositionChanged(String str, long j) {
        super.onTimeShiftCurrentPositionChanged(str, j);
        this.a.j = j;
    }
}
