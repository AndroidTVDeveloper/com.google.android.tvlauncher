package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: dhd  reason: default package */
/* compiled from: PG */
public interface dhd extends ExecutorService {
    dhb a(Runnable runnable);

    dhb a(Runnable runnable, Object obj);

    dhb a(Callable callable);
}
