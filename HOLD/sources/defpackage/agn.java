package defpackage;

/* renamed from: agn  reason: default package */
/* compiled from: PG */
public enum agn {
    RUNNING(false),
    PAUSED(false),
    CLEARED(false),
    SUCCESS(true),
    FAILED(true);
    
    public final boolean f;

    private agn(boolean z) {
        this.f = z;
    }
}
