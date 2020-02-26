package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: bpz  reason: default package */
/* compiled from: PG */
final class bpz implements bot {
    private final /* synthetic */ BasePendingResult a;
    private final /* synthetic */ bqb b;

    public bpz(bqb bqb, BasePendingResult basePendingResult) {
        this.b = bqb;
        this.a = basePendingResult;
    }

    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
