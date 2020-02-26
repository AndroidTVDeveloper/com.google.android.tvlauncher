package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: cwm  reason: default package */
/* compiled from: PG */
public final class cwm extends aio implements cwn {
    public cwm(IBinder iBinder) {
        super(iBinder, "com.google.android.tvlauncher.instantvideo.media.impl.IRemoteYoutubePlayerClient");
    }

    public final void a(String str) {
        Parcel a = a();
        a.writeString(str);
        c(1, a);
    }

    public final void b() {
        c(2, a());
    }

    public final void d() {
        c(4, a());
    }

    public final void c() {
        c(3, a());
    }
}
