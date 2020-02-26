package defpackage;

/* renamed from: id  reason: default package */
/* compiled from: PG */
final class id implements Runnable {
    public final /* synthetic */ ie a;

    public id(ie ieVar) {
        this.a = ieVar;
    }

    public final void run() {
        ie ieVar = this.a;
        ieVar.b = null;
        ieVar.drawableStateChanged();
    }
}
