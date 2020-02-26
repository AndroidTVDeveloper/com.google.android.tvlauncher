package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: su  reason: default package */
/* compiled from: PG */
public final class su extends agj implements Cloneable {
    private sy A;
    private Object B;
    private List C;
    private boolean D = true;
    private boolean E;
    private boolean F;
    public su a;
    public su b;
    private final Context w;
    private final sx x;
    private final Class y;
    private final sl z;

    static {
        new agj((byte) 0).a(vy.b).a(sm.LOW).g();
    }

    protected su(si siVar, sx sxVar, Class cls, Context context) {
        this.x = sxVar;
        this.y = cls;
        this.w = context;
        sl slVar = sxVar.a.b;
        sy syVar = (sy) slVar.e.get(cls);
        if (syVar == null) {
            for (Map.Entry entry : slVar.e.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    syVar = (sy) entry.getValue();
                }
            }
        }
        this.A = syVar == null ? sl.a : syVar;
        this.z = siVar.b;
        for (agq agq : sxVar.c) {
            if (agq != null) {
                if (this.C == null) {
                    this.C = new ArrayList();
                }
                this.C.add(agq);
            }
        }
        b(sxVar.f());
    }

    /* renamed from: a */
    public final su b(agj agj) {
        aic.a(agj);
        return (su) super.b(agj);
    }

    private final agm a(Object obj, ahg ahg, agq agq, ago ago, sy syVar, sm smVar, int i, int i2, agj agj, Executor executor) {
        agk agk;
        agk agk2;
        agt agt;
        int i3;
        int i4;
        sm smVar2;
        int i5;
        int i6;
        sm smVar3;
        Object obj2 = obj;
        agj agj2 = agj;
        if (this.b != null) {
            agk2 = new agk(obj2, ago);
            agk = agk2;
        } else {
            agk = null;
            agk2 = ago;
        }
        su suVar = this.a;
        if (suVar == null) {
            agt = a(obj, ahg, agq, agj, agk2, syVar, smVar, i, i2, executor);
        } else if (!this.F) {
            sy syVar2 = !suVar.D ? suVar.A : syVar;
            if (suVar.a(8)) {
                smVar2 = this.a.e;
            } else {
                int i7 = st.b[smVar.ordinal()];
                if (i7 == 1) {
                    smVar3 = sm.NORMAL;
                } else if (i7 == 2) {
                    smVar3 = sm.HIGH;
                } else if (i7 == 3 || i7 == 4) {
                    smVar3 = sm.IMMEDIATE;
                } else {
                    String valueOf = String.valueOf(this.e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("unknown priority: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
                smVar2 = smVar3;
            }
            su suVar2 = this.a;
            int i8 = suVar2.k;
            int i9 = suVar2.j;
            if (!aie.a(i, i2) || this.a.e()) {
                i5 = i9;
                i6 = i8;
            } else {
                i6 = agj2.k;
                i5 = agj2.j;
            }
            agt agt2 = new agt(obj2, agk2);
            Object obj3 = obj;
            ahg ahg2 = ahg;
            agq agq2 = agq;
            agt agt3 = agt2;
            agm a2 = a(obj3, ahg2, agq2, agj, agt2, syVar, smVar, i, i2, executor);
            this.F = true;
            su suVar3 = this.a;
            agm a3 = suVar3.a(obj3, ahg2, agq2, agt3, syVar2, smVar2, i6, i5, suVar3, executor);
            this.F = false;
            agt agt4 = agt3;
            agt4.a = a2;
            agt4.b = a3;
            agt = agt4;
        } else {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        if (agk == null) {
            return agt;
        }
        su suVar4 = this.b;
        int i10 = suVar4.k;
        int i11 = suVar4.j;
        if (!aie.a(i, i2) || this.b.e()) {
            i3 = i11;
            i4 = i10;
        } else {
            i4 = agj2.k;
            i3 = agj2.j;
        }
        su suVar5 = this.b;
        agm a4 = suVar5.a(obj, ahg, agq, agk, suVar5.A, suVar5.e, i4, i3, suVar5, executor);
        agk.a = agt;
        agk.b = a4;
        return agk;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final su clone() {
        su suVar = (su) super.clone();
        suVar.A = suVar.A.clone();
        return suVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.widget.ImageView r4) {
        /*
            r3 = this;
            defpackage.aie.a()
            defpackage.aic.a(r4)
            r0 = 2048(0x800, float:2.87E-42)
            boolean r0 = r3.a(r0)
            if (r0 != 0) goto L_0x005a
            boolean r0 = r3.n
            if (r0 == 0) goto L_0x005a
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L_0x005a
            int[] r0 = defpackage.st.a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x004a;
                case 2: goto L_0x0041;
                case 3: goto L_0x0031;
                case 4: goto L_0x0031;
                case 5: goto L_0x0031;
                case 6: goto L_0x0028;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x005a
        L_0x0028:
            su r0 = r3.clone()
            agj r0 = r0.c()
            goto L_0x005b
        L_0x0031:
            su r0 = r3.clone()
            acu r1 = defpackage.acu.b
            adc r2 = new adc
            r2.<init>()
            agj r0 = r0.b(r1, r2)
            goto L_0x005b
        L_0x0041:
            su r0 = r3.clone()
            agj r0 = r0.c()
            goto L_0x005b
        L_0x004a:
            su r0 = r3.clone()
            acu r1 = defpackage.acu.d
            aci r2 = new aci
            r2.<init>()
            agj r0 = r0.a(r1, r2)
            goto L_0x005b
        L_0x005a:
            r0 = r3
        L_0x005b:
            java.lang.Class r1 = r3.y
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x006b
            agv r1 = new agv
            r1.<init>(r4)
            goto L_0x007a
        L_0x006b:
            java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
            boolean r2 = r2.isAssignableFrom(r1)
            if (r2 == 0) goto L_0x0084
            aha r1 = new aha
            r1.<init>(r4)
        L_0x007a:
            r4 = 0
            java.util.concurrent.Executor r2 = defpackage.ahx.a
            ahg r4 = r3.a(r1, r4, r0, r2)
            ahj r4 = (defpackage.ahj) r4
            return
        L_0x0084:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 64
            r2.<init>(r1)
            java.lang.String r1 = "Unhandled class: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.su.a(android.widget.ImageView):void");
    }

    public final void a(ahg ahg) {
        a(ahg, null, this, ahx.a);
    }

    public final ahg a(ahg ahg, agq agq, agj agj, Executor executor) {
        ahg ahg2 = ahg;
        agj agj2 = agj;
        aic.a(ahg);
        if (this.E) {
            agm a2 = a(new Object(), ahg, agq, (ago) null, this.A, agj2.e, agj2.k, agj2.j, agj, executor);
            agm d = ahg.d();
            if (!a2.a(d) || (!agj2.i && d.e())) {
                this.x.a(ahg);
                ahg.a(a2);
                this.x.a(ahg, a2);
                return ahg2;
            }
            if (!((agm) aic.a(d)).d()) {
                d.a();
            }
            return ahg2;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public final void a(Object obj) {
        this.B = obj;
        this.E = true;
    }

    private final agm a(Object obj, ahg ahg, agq agq, agj agj, ago ago, sy syVar, sm smVar, int i, int i2, Executor executor) {
        Context context = this.w;
        sl slVar = this.z;
        return new ags(context, slVar, obj, this.B, this.y, agj, i, i2, smVar, ahg, agq, this.C, ago, slVar.f, executor);
    }

    public final void b() {
        a((ahg) new ahd(this.x));
    }
}
