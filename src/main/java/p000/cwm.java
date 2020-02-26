package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: cwm */
/* compiled from: PG */
public final class cwm extends aio implements cwn {
    public cwm(IBinder iBinder) {
        super(iBinder, "com.google.android.tvlauncher.instantvideo.media.impl.IRemoteYoutubePlayerClient");
    }

    /* renamed from: a */
    public final void mo3891a(String str) {
        Parcel a = mo321a();
        a.writeString(str);
        mo325c(1, a);
    }

    /* renamed from: b */
    public final void mo3892b() {
        mo325c(2, mo321a());
    }

    /* renamed from: d */
    public final void mo3894d() {
        mo325c(4, mo321a());
    }

    /* renamed from: c */
    public final void mo3893c() {
        mo325c(3, mo321a());
    }
}
