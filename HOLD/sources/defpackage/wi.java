package defpackage;

import java.util.concurrent.Executor;

/* renamed from: wi  reason: default package */
/* compiled from: PG */
final class wi {
    public final agr a;
    public final Executor b;

    public wi(agr agr, Executor executor) {
        this.a = agr;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wi) {
            return this.a.equals(((wi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
