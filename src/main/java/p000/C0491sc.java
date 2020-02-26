package p000;

/* renamed from: sc */
/* compiled from: PG */
class C0491sc extends bru {

    /* renamed from: l */
    public C0034bf[] f10319l = null;

    /* renamed from: m */
    public String f10320m;

    /* renamed from: n */
    public int f10321n = 0;

    public C0491sc() {
        super((byte) 0);
    }

    /* renamed from: a */
    public boolean mo5842a() {
        return false;
    }

    public C0034bf[] getPathData() {
        return this.f10319l;
    }

    public String getPathName() {
        return this.f10320m;
    }

    public C0491sc(C0491sc scVar) {
        super((byte) 0);
        this.f10320m = scVar.f10320m;
        this.f10319l = C0035bg.m3115a(scVar.f10319l);
    }

    public void setPathData(C0034bf[] bfVarArr) {
        C0034bf[] bfVarArr2 = this.f10319l;
        if (!(bfVarArr2 == null || bfVarArr == null || bfVarArr2.length != bfVarArr.length)) {
            int i = 0;
            while (i < bfVarArr2.length) {
                C0034bf bfVar = bfVarArr2[i];
                char c = bfVar.f3612a;
                C0034bf bfVar2 = bfVarArr[i];
                if (c == bfVar2.f3612a && bfVar.f3613b.length == bfVar2.f3613b.length) {
                    i++;
                }
            }
            C0034bf[] bfVarArr3 = this.f10319l;
            for (int i2 = 0; i2 < bfVarArr.length; i2++) {
                bfVarArr3[i2].f3612a = bfVarArr[i2].f3612a;
                int i3 = 0;
                while (true) {
                    float[] fArr = bfVarArr[i2].f3613b;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    bfVarArr3[i2].f3613b[i3] = fArr[i3];
                    i3++;
                }
            }
            return;
        }
        this.f10319l = C0035bg.m3115a(bfVarArr);
    }
}
