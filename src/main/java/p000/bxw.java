package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: bxw */
/* compiled from: PG */
public class bxw extends aip implements bxx {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo326a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                mo2536a((Status) aiq.m585a(parcel, Status.CREATOR), (bxu) aiq.m585a(parcel, bxu.CREATOR));
                return true;
            case 3:
                Status status = (Status) aiq.m585a(parcel, Status.CREATOR);
                throw new IllegalStateException("Not implemented.");
            case 4:
                Status status2 = (Status) aiq.m585a(parcel, Status.CREATOR);
                throw new IllegalStateException("Not implemented.");
            case 5:
                mo2535a((Status) aiq.m585a(parcel, Status.CREATOR));
                return true;
            case 6:
                Status status3 = (Status) aiq.m585a(parcel, Status.CREATOR);
                parcel.createStringArrayList();
                throw new IllegalStateException("Not implemented.");
            case 7:
                Status status4 = (Status) aiq.m585a(parcel, Status.CREATOR);
                throw new IllegalStateException("Not implemented.");
            case 8:
                Status status5 = (Status) aiq.m585a(parcel, Status.CREATOR);
                aiq.m589a(parcel);
                bxk bxk = (bxk) aiq.m585a(parcel, bxk.CREATOR);
                throw new IllegalStateException("Not implemented.");
            case 9:
                Status status6 = (Status) aiq.m585a(parcel, Status.CREATOR);
                bxk bxk2 = (bxk) aiq.m585a(parcel, bxk.CREATOR);
                throw new IllegalStateException("Not implemented");
            default:
                return false;
        }
    }

    public /* synthetic */ bxw() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    /* renamed from: a */
    public void mo2536a(Status status, bxu bxu) {
        throw new IllegalStateException("Not implemented.");
    }

    /* renamed from: a */
    public void mo2535a(Status status) {
        throw new IllegalStateException("Not implemented.");
    }
}
