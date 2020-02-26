package defpackage;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.Surface;
import com.google.android.tvlauncher.instantvideo.media.impl.RemoteYoutubePlayerService;

/* renamed from: cwo  reason: default package */
/* compiled from: PG */
public final class cwo extends aip implements IInterface {
    public final /* synthetic */ RemoteYoutubePlayerService a;

    public cwo() {
        super("com.google.android.tvlauncher.instantvideo.media.impl.IRemoteYoutubePlayerService");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        cwm cwm;
        if (i == 1) {
            Surface surface = (Surface) aiq.a(parcel, Surface.CREATOR);
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.tvlauncher.instantvideo.media.impl.IRemoteYoutubePlayerClient");
                cwm = queryLocalInterface instanceof cwn ? (cwn) queryLocalInterface : new cwm(readStrongBinder);
            } else {
                cwm = null;
            }
            this.a.a.post(new cwp(this, surface, readInt, readInt2, cwm));
        } else if (i == 2) {
            this.a.a.post(new cwq(this, parcel.readString()));
        } else if (i == 3) {
            parcel.readFloat();
            this.a.a.post(new cwr(this, parcel.readString(), (Uri) aiq.a(parcel, Uri.CREATOR)));
        } else if (i == 4) {
            this.a.a.post(new cws(this, parcel.readString(), parcel.readFloat()));
        } else if (i != 5) {
            return false;
        } else {
            this.a.a.post(new cwt(this, parcel.readString(), parcel.readInt(), parcel.readInt()));
        }
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cwo(RemoteYoutubePlayerService remoteYoutubePlayerService) {
        super("com.google.android.tvlauncher.instantvideo.media.impl.IRemoteYoutubePlayerService");
        this.a = remoteYoutubePlayerService;
    }
}
