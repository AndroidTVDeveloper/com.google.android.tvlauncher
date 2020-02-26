package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* renamed from: sb  reason: default package */
/* compiled from: PG */
final class sb extends bru {
    public final Matrix a = new Matrix();
    public final ArrayList b = new ArrayList();
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 1.0f;
    public float g = 1.0f;
    public float h = 0.0f;
    public float i = 0.0f;
    public final Matrix j = new Matrix();
    public String k = null;

    public sb() {
        super((byte) 0);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sb(sb sbVar, cl clVar) {
        super((byte) 0);
        sc scVar;
        this.c = sbVar.c;
        this.d = sbVar.d;
        this.e = sbVar.e;
        this.f = sbVar.f;
        this.g = sbVar.g;
        this.h = sbVar.h;
        this.i = sbVar.i;
        String str = sbVar.k;
        this.k = str;
        if (str != null) {
            clVar.put(str, this);
        }
        this.j.set(sbVar.j);
        ArrayList arrayList = sbVar.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof sb) {
                this.b.add(new sb((sb) obj, clVar));
            } else {
                if (obj instanceof sa) {
                    scVar = new sa((sa) obj);
                } else if (obj instanceof rz) {
                    scVar = new rz((rz) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(scVar);
                String str2 = scVar.m;
                if (str2 != null) {
                    clVar.put(str2, scVar);
                }
            }
        }
    }

    public final boolean b() {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            if (((bru) this.b.get(i2)).b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(int[] iArr) {
        boolean z = false;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            z |= ((bru) this.b.get(i2)).a(iArr);
        }
        if (z) {
            return true;
        }
        return false;
    }

    public void setPivotX(float f2) {
        if (f2 != this.d) {
            this.d = f2;
            a();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.e) {
            this.e = f2;
            a();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.c) {
            this.c = f2;
            a();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f) {
            this.f = f2;
            a();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.g) {
            this.g = f2;
            a();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.h) {
            this.h = f2;
            a();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.i) {
            this.i = f2;
            a();
        }
    }

    public final void a() {
        this.j.reset();
        this.j.postTranslate(-this.d, -this.e);
        this.j.postScale(this.f, this.g);
        this.j.postRotate(this.c, 0.0f, 0.0f);
        this.j.postTranslate(this.h + this.d, this.i + this.e);
    }
}
