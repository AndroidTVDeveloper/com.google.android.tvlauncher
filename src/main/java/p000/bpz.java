package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: bpz */
/* compiled from: PG */
final class bpz implements bot {

    /* renamed from: a */
    private final /* synthetic */ BasePendingResult f4568a;

    /* renamed from: b */
    private final /* synthetic */ bqb f4569b;

    public bpz(bqb bqb, BasePendingResult basePendingResult) {
        this.f4569b = bqb;
        this.f4568a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo2248a(Status status) {
        this.f4569b.f4572a.remove(this.f4568a);
    }
}
