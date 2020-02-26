package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: ep  reason: default package */
/* compiled from: PG */
public final class ep implements ActionMode.Callback {
    private final ActionMode.Callback a;
    private final TextView b;
    private Class c;
    private Method d;
    private boolean e;
    private boolean f = false;

    public ep(ActionMode.Callback callback, TextView textView) {
        this.a = callback;
        this.b = textView;
    }

    private static final Intent a() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.a.onActionItemClicked(actionMode, menuItem);
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.a.onCreateActionMode(actionMode, menu);
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
        this.a.onDestroyActionMode(actionMode);
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Method method;
        boolean z;
        Context context = this.b.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.f) {
            this.f = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.c = cls;
                this.d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                this.e = true;
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                this.c = null;
                this.d = null;
                this.e = false;
            }
        }
        try {
            if (!this.e || !this.c.isInstance(menu)) {
                method = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
            } else {
                method = this.d;
            }
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    method.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo next : packageManager.queryIntentActivities(a(), 0)) {
                    if (context.getPackageName().equals(next.activityInfo.packageName) || (next.activityInfo.exported && (next.activityInfo.permission == null || context.checkSelfPermission(next.activityInfo.permission) == 0))) {
                        arrayList.add(next);
                    }
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                MenuItem add = menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager));
                TextView textView = this.b;
                Intent a2 = a();
                if (!(textView instanceof Editable) || !textView.onCheckIsTextEditor() || !textView.isEnabled()) {
                    z = false;
                } else {
                    z = true;
                }
                add.setIntent(a2.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
        }
        return this.a.onPrepareActionMode(actionMode, menu);
    }
}
