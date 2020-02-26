package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: bng  reason: default package */
/* compiled from: PG */
public final class bng extends aip implements bnh {
    private final /* synthetic */ bne a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bng(bne bne) {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
        this.a = bne;
    }

    public final void a(Status status) {
        this.a.a((box) status);
    }

    public bng() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a((Status) aiq.a(parcel, Status.CREATOR));
                return true;
            case 2:
                Status status = (Status) aiq.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            case 3:
                Status status2 = (Status) aiq.a(parcel, Status.CREATOR);
                parcel.readLong();
                throw new UnsupportedOperationException();
            case 4:
                Status status3 = (Status) aiq.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            case 5:
                Status status4 = (Status) aiq.a(parcel, Status.CREATOR);
                parcel.readLong();
                throw new UnsupportedOperationException();
            case 6:
                Status status5 = (Status) aiq.a(parcel, Status.CREATOR);
                bnc[] bncArr = (bnc[]) parcel.createTypedArray(bnc.CREATOR);
                throw new UnsupportedOperationException();
            case 7:
                DataHolder dataHolder = (DataHolder) aiq.a(parcel, DataHolder.CREATOR);
                throw new UnsupportedOperationException();
            case 8:
                Status status6 = (Status) aiq.a(parcel, Status.CREATOR);
                bna bna = (bna) aiq.a(parcel, bna.CREATOR);
                throw new UnsupportedOperationException();
            case 9:
                Status status7 = (Status) aiq.a(parcel, Status.CREATOR);
                bna bna2 = (bna) aiq.a(parcel, bna.CREATOR);
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }
}
