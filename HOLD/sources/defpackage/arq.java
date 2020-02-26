package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: arq  reason: default package */
/* compiled from: PG */
public final class arq implements asv {
    private final int a;
    private final List b;

    public arq() {
        this((byte) 0);
    }

    private final boolean a(int i) {
        return (i & this.a) != 0;
    }

    public arq(byte b2) {
        this(0, Collections.singletonList(akh.a("application/cea-608")));
    }

    public arq(int i, List list) {
        this.a = i;
        this.b = list;
    }

    private final asm a(asu asu) {
        return new asm(b(asu));
    }

    public final SparseArray a() {
        return new SparseArray();
    }

    public final asx a(int i, asu asu) {
        if (i == 2) {
            return new asf(new arv(new asy(b(asu))));
        }
        if (i == 3 || i == 4) {
            return new asf(new asd(asu.b));
        }
        if (i != 15) {
            if (i != 17) {
                if (i == 21) {
                    return new asf(new asb());
                }
                if (i != 27) {
                    if (i == 36) {
                        return new asf(new asa(a(asu)));
                    }
                    if (i == 89) {
                        return new asf(new ars(asu.c));
                    }
                    if (i != 138) {
                        if (i == 172) {
                            return new asf(new arn(asu.b));
                        }
                        if (i != 129) {
                            if (i != 130) {
                                if (i != 134) {
                                    if (i != 135) {
                                        return null;
                                    }
                                } else if (!a(16)) {
                                    return new asl(new asn());
                                } else {
                                    return null;
                                }
                            } else if (!a(64)) {
                                return null;
                            }
                        }
                        return new asf(new arl(asu.b));
                    }
                    return new asf(new arr(asu.b));
                } else if (!a(4)) {
                    return new asf(new ary(a(asu), a(1), a(8)));
                } else {
                    return null;
                }
            } else if (!a(2)) {
                return new asf(new asc(asu.b));
            } else {
                return null;
            }
        } else if (!a(2)) {
            return new asf(new arp(false, asu.b));
        } else {
            return null;
        }
    }

    private final List b(asu asu) {
        int i;
        String str;
        List list;
        if (a(32)) {
            return this.b;
        }
        bky bky = new bky(asu.d);
        List list2 = this.b;
        while (bky.b() > 0) {
            int d = bky.d();
            int d2 = bky.b + bky.d();
            if (d == 134) {
                list2 = new ArrayList();
                int d3 = bky.d() & 31;
                for (int i2 = 0; i2 < d3; i2++) {
                    String e = bky.e(3);
                    int d4 = bky.d();
                    int i3 = d4 & 128;
                    if (i3 != 0) {
                        i = d4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte d5 = (byte) bky.d();
                    bky.d(1);
                    if (i3 != 0) {
                        list = Collections.singletonList(new byte[]{(d5 & 64) != 0 ? (byte) 1 : 0});
                    } else {
                        list = null;
                    }
                    list2.add(akh.a((String) null, str, 0, e, i, (anq) null, Long.MAX_VALUE, list));
                }
            }
            bky.c(d2);
        }
        return list2;
    }
}
