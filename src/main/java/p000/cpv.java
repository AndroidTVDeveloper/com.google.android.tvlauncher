package p000;

import java.util.HashSet;

/* renamed from: cpv */
/* compiled from: PG */
final /* synthetic */ class cpv implements Runnable {

    /* renamed from: a */
    private final cqp f6950a;

    public cpv(cqp cqp) {
        this.f6950a = cqp;
    }

    public final void run() {
        int i;
        int i2;
        cqp cqp = this.f6950a;
        HashSet<Integer> hashSet = new HashSet<>(cqp.f7025q.size() + 5);
        int i3 = cqp.f7024p;
        if (i3 == 0 || i3 == 1) {
            hashSet.addAll(cqp.f7025q);
            cqp.f7025q.clear();
            hashSet.add(Integer.valueOf(cqp.f7026r));
            hashSet.add(Integer.valueOf(cqp.f7026r - 1));
            hashSet.add(Integer.valueOf(cqp.f7026r + 1));
        }
        if (cqp.f7024p == 0 && ((i2 = cqp.f7026r) == 0 || i2 == 1)) {
            hashSet.add(Integer.valueOf(i2 + 2));
            hashSet.add(Integer.valueOf(cqp.f7026r + 3));
        }
        if (cqp.f7024p == 1 && ((i = cqp.f7026r) == 0 || i == 1)) {
            hashSet.add(Integer.valueOf(i + 2));
            hashSet.add(Integer.valueOf(cqp.f7026r + 3));
            hashSet.add(Integer.valueOf(cqp.f7026r + 4));
        }
        int a = cqp.mo2794a();
        for (Integer num : hashSet) {
            if (num.intValue() >= 0 && num.intValue() < a) {
                cqp.mo5306a(num.intValue(), "PAYLOAD_STATE");
            }
        }
    }
}
