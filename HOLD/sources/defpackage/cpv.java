package defpackage;

import java.util.HashSet;

/* renamed from: cpv  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cpv implements Runnable {
    private final cqp a;

    public cpv(cqp cqp) {
        this.a = cqp;
    }

    public final void run() {
        int i;
        int i2;
        cqp cqp = this.a;
        HashSet<Integer> hashSet = new HashSet<>(cqp.q.size() + 5);
        int i3 = cqp.p;
        if (i3 == 0 || i3 == 1) {
            hashSet.addAll(cqp.q);
            cqp.q.clear();
            hashSet.add(Integer.valueOf(cqp.r));
            hashSet.add(Integer.valueOf(cqp.r - 1));
            hashSet.add(Integer.valueOf(cqp.r + 1));
        }
        if (cqp.p == 0 && ((i2 = cqp.r) == 0 || i2 == 1)) {
            hashSet.add(Integer.valueOf(i2 + 2));
            hashSet.add(Integer.valueOf(cqp.r + 3));
        }
        if (cqp.p == 1 && ((i = cqp.r) == 0 || i == 1)) {
            hashSet.add(Integer.valueOf(i + 2));
            hashSet.add(Integer.valueOf(cqp.r + 3));
            hashSet.add(Integer.valueOf(cqp.r + 4));
        }
        int a2 = cqp.a();
        for (Integer num : hashSet) {
            if (num.intValue() >= 0 && num.intValue() < a2) {
                cqp.a(num.intValue(), "PAYLOAD_STATE");
            }
        }
    }
}
