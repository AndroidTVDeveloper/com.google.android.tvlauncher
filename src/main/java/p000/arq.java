package p000;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: arq */
/* compiled from: PG */
public final class arq implements asv {

    /* renamed from: a */
    private final int f2050a;

    /* renamed from: b */
    private final List f2051b;

    public arq() {
        this((byte) 0);
    }

    /* renamed from: a */
    private final boolean m1924a(int i) {
        return (i & this.f2050a) != 0;
    }

    public arq(byte b) {
        this(0, Collections.singletonList(akh.m727a("application/cea-608")));
    }

    public arq(int i, List list) {
        this.f2050a = i;
        this.f2051b = list;
    }

    /* renamed from: a */
    private final asm m1923a(asu asu) {
        return new asm(m1925b(asu));
    }

    /* renamed from: a */
    public final SparseArray mo1287a() {
        return new SparseArray();
    }

    /* renamed from: a */
    public final asx mo1288a(int i, asu asu) {
        if (i == 2) {
            return new asf(new arv(new asy(m1925b(asu))));
        }
        if (i == 3 || i == 4) {
            return new asf(new asd(asu.f2303b));
        }
        if (i != 15) {
            if (i != 17) {
                if (i == 21) {
                    return new asf(new asb());
                }
                if (i != 27) {
                    if (i == 36) {
                        return new asf(new asa(m1923a(asu)));
                    }
                    if (i == 89) {
                        return new asf(new ars(asu.f2304c));
                    }
                    if (i != 138) {
                        if (i == 172) {
                            return new asf(new arn(asu.f2303b));
                        }
                        if (i != 129) {
                            if (i != 130) {
                                if (i != 134) {
                                    if (i != 135) {
                                        return null;
                                    }
                                } else if (!m1924a(16)) {
                                    return new asl(new asn());
                                } else {
                                    return null;
                                }
                            } else if (!m1924a(64)) {
                                return null;
                            }
                        }
                        return new asf(new arl(asu.f2303b));
                    }
                    return new asf(new arr(asu.f2303b));
                } else if (!m1924a(4)) {
                    return new asf(new ary(m1923a(asu), m1924a(1), m1924a(8)));
                } else {
                    return null;
                }
            } else if (!m1924a(2)) {
                return new asf(new asc(asu.f2303b));
            } else {
                return null;
            }
        } else if (!m1924a(2)) {
            return new asf(new arp(false, asu.f2303b));
        } else {
            return null;
        }
    }

    /* renamed from: b */
    private final List m1925b(asu asu) {
        int i;
        String str;
        List list;
        if (m1924a(32)) {
            return this.f2051b;
        }
        bky bky = new bky(asu.f2305d);
        List list2 = this.f2051b;
        while (bky.mo2070b() > 0) {
            int d = bky.mo2074d();
            int d2 = bky.f4259b + bky.mo2074d();
            if (d == 134) {
                list2 = new ArrayList();
                int d3 = bky.mo2074d() & 31;
                for (int i2 = 0; i2 < d3; i2++) {
                    String e = bky.mo2077e(3);
                    int d4 = bky.mo2074d();
                    int i3 = d4 & 128;
                    if (i3 != 0) {
                        i = d4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte d5 = (byte) bky.mo2074d();
                    bky.mo2075d(1);
                    if (i3 != 0) {
                        list = Collections.singletonList(new byte[]{(d5 & 64) != 0 ? (byte) 1 : 0});
                    } else {
                        list = null;
                    }
                    list2.add(akh.m732a((String) null, str, 0, e, i, (anq) null, Long.MAX_VALUE, list));
                }
            }
            bky.mo2073c(d2);
        }
        return list2;
    }
}
