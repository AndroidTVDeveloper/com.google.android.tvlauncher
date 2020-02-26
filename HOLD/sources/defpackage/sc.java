package defpackage;

/* renamed from: sc  reason: default package */
/* compiled from: PG */
class sc extends bru {
    public bf[] l = null;
    public String m;
    public int n = 0;

    public sc() {
        super((byte) 0);
    }

    public boolean a() {
        return false;
    }

    public bf[] getPathData() {
        return this.l;
    }

    public String getPathName() {
        return this.m;
    }

    public sc(sc scVar) {
        super((byte) 0);
        this.m = scVar.m;
        this.l = bg.a(scVar.l);
    }

    public void setPathData(bf[] bfVarArr) {
        bf[] bfVarArr2 = this.l;
        if (!(bfVarArr2 == null || bfVarArr == null || bfVarArr2.length != bfVarArr.length)) {
            int i = 0;
            while (i < bfVarArr2.length) {
                bf bfVar = bfVarArr2[i];
                char c = bfVar.a;
                bf bfVar2 = bfVarArr[i];
                if (c == bfVar2.a && bfVar.b.length == bfVar2.b.length) {
                    i++;
                }
            }
            bf[] bfVarArr3 = this.l;
            for (int i2 = 0; i2 < bfVarArr.length; i2++) {
                bfVarArr3[i2].a = bfVarArr[i2].a;
                int i3 = 0;
                while (true) {
                    float[] fArr = bfVarArr[i2].b;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    bfVarArr3[i2].b[i3] = fArr[i3];
                    i3++;
                }
            }
            return;
        }
        this.l = bg.a(bfVarArr);
    }
}
