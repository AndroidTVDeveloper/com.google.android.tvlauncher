package defpackage;

import java.io.Serializable;

/* renamed from: dfc  reason: default package */
/* compiled from: PG */
public abstract class dfc implements Serializable {
    public static final long serialVersionUID = 0;

    public abstract boolean a();

    public abstract Object b();

    public static dfc b(Object obj) {
        return new dfe(obj);
    }

    public static dfc a(Object obj) {
        return new dfe(dgx.a(obj));
    }
}
