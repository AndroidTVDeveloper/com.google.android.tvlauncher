package p000;

import android.media.tv.TvView;

/* renamed from: cwx */
/* compiled from: PG */
final class cwx extends TvView.TimeShiftPositionCallback {

    /* renamed from: a */
    private final /* synthetic */ cwz f7800a;

    public cwx(cwz cwz) {
        this.f7800a = cwz;
    }

    public final void onTimeShiftCurrentPositionChanged(String str, long j) {
        super.onTimeShiftCurrentPositionChanged(str, j);
        this.f7800a.f7811j = j;
    }
}
