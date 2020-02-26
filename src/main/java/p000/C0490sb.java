package p000;

import android.graphics.Matrix;
import java.util.ArrayList;

/* renamed from: sb */
/* compiled from: PG */
final class C0490sb extends bru {

    /* renamed from: a */
    public final Matrix f10308a = new Matrix();

    /* renamed from: b */
    public final ArrayList f10309b = new ArrayList();

    /* renamed from: c */
    public float f10310c = 0.0f;

    /* renamed from: d */
    public float f10311d = 0.0f;

    /* renamed from: e */
    public float f10312e = 0.0f;

    /* renamed from: f */
    public float f10313f = 1.0f;

    /* renamed from: g */
    public float f10314g = 1.0f;

    /* renamed from: h */
    public float f10315h = 0.0f;

    /* renamed from: i */
    public float f10316i = 0.0f;

    /* renamed from: j */
    public final Matrix f10317j = new Matrix();

    /* renamed from: k */
    public String f10318k = null;

    public C0490sb() {
        super((byte) 0);
    }

    public String getGroupName() {
        return this.f10318k;
    }

    public Matrix getLocalMatrix() {
        return this.f10317j;
    }

    public float getPivotX() {
        return this.f10311d;
    }

    public float getPivotY() {
        return this.f10312e;
    }

    public float getRotation() {
        return this.f10310c;
    }

    public float getScaleX() {
        return this.f10313f;
    }

    public float getScaleY() {
        return this.f10314g;
    }

    public float getTranslateX() {
        return this.f10315h;
    }

    public float getTranslateY() {
        return this.f10316i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0490sb(C0490sb sbVar, C0067cl clVar) {
        super((byte) 0);
        C0491sc scVar;
        this.f10310c = sbVar.f10310c;
        this.f10311d = sbVar.f10311d;
        this.f10312e = sbVar.f10312e;
        this.f10313f = sbVar.f10313f;
        this.f10314g = sbVar.f10314g;
        this.f10315h = sbVar.f10315h;
        this.f10316i = sbVar.f10316i;
        String str = sbVar.f10318k;
        this.f10318k = str;
        if (str != null) {
            clVar.put(str, this);
        }
        this.f10317j.set(sbVar.f10317j);
        ArrayList arrayList = sbVar.f10309b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C0490sb) {
                this.f10309b.add(new C0490sb((C0490sb) obj, clVar));
            } else {
                if (obj instanceof C0489sa) {
                    scVar = new C0489sa((C0489sa) obj);
                } else if (obj instanceof C0487rz) {
                    scVar = new C0487rz((C0487rz) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f10309b.add(scVar);
                String str2 = scVar.f10320m;
                if (str2 != null) {
                    clVar.put(str2, scVar);
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo2363b() {
        for (int i = 0; i < this.f10309b.size(); i++) {
            if (((bru) this.f10309b.get(i)).mo2363b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo2362a(int[] iArr) {
        boolean z = false;
        for (int i = 0; i < this.f10309b.size(); i++) {
            z |= ((bru) this.f10309b.get(i)).mo2362a(iArr);
        }
        if (z) {
            return true;
        }
        return false;
    }

    public void setPivotX(float f) {
        if (f != this.f10311d) {
            this.f10311d = f;
            mo5859a();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f10312e) {
            this.f10312e = f;
            mo5859a();
        }
    }

    public void setRotation(float f) {
        if (f != this.f10310c) {
            this.f10310c = f;
            mo5859a();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f10313f) {
            this.f10313f = f;
            mo5859a();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f10314g) {
            this.f10314g = f;
            mo5859a();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f10315h) {
            this.f10315h = f;
            mo5859a();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f10316i) {
            this.f10316i = f;
            mo5859a();
        }
    }

    /* renamed from: a */
    public final void mo5859a() {
        this.f10317j.reset();
        this.f10317j.postTranslate(-this.f10311d, -this.f10312e);
        this.f10317j.postScale(this.f10313f, this.f10314g);
        this.f10317j.postRotate(this.f10310c, 0.0f, 0.0f);
        this.f10317j.postTranslate(this.f10315h + this.f10311d, this.f10316i + this.f10312e);
    }
}
