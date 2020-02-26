package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: bxw  reason: default package */
/* compiled from: PG */
public class bxw extends aip implements bxx {
    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                a((Status) aiq.a(parcel, Status.CREATOR), (bxu) aiq.a(parcel, bxu.CREATOR));
                return true;
            case 3:
                Status status = (Status) aiq.a(parcel, Status.CREATOR);
                throw new IllegalStateException("Not implemented.");
            case 4:
                Status status2 = (Status) aiq.a(parcel, Status.CREATOR);
                throw new IllegalStateException("Not implemented.");
            case 5:
                a((Status) aiq.a(parcel, Status.CREATOR));
                return true;
            case 6:
                Status status3 = (Status) aiq.a(parcel, Status.CREATOR);
                parcel.createStringArrayList();
                throw new IllegalStateException("Not implemented.");
            case 7:
                Status status4 = (Status) aiq.a(parcel, Status.CREATOR);
                throw new IllegalStateException("Not implemented.");
            case 8:
                Status status5 = (Status) aiq.a(parcel, Status.CREATOR);
                aiq.a(parcel);
                bxk bxk = (bxk) aiq.a(parcel, bxk.CREATOR);
                throw new IllegalStateException("Not implemented.");
            case 9:
                Status status6 = (Status) aiq.a(parcel, Status.CREATOR);
                bxk bxk2 = (bxk) aiq.a(parcel, bxk.CREATOR);
                throw new IllegalStateException("Not implemented");
            default:
                return false;
        }
    }

    public /* synthetic */ bxw() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    public void a(Status status, bxu bxu) {
        throw new IllegalStateException("Not implemented.");
    }

    public void a(Status status) {
        throw new IllegalStateException("Not implemented.");
    }
}
