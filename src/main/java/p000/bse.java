package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: bse */
/* compiled from: PG */
public final class bse {

    /* renamed from: a */
    public static final Status f4722a = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: b */
    public static final BasePendingResult[] f4723b = new BasePendingResult[0];

    /* renamed from: c */
    public final Set f4724c = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: d */
    private final bsd f4725d = new bsc(this);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2368a(BasePendingResult basePendingResult) {
        this.f4724c.add(basePendingResult);
        basePendingResult.mo3196a(this.f4725d);
    }
}
