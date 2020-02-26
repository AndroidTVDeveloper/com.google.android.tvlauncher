package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.DialogPreference;

@Deprecated
/* renamed from: qq  reason: default package */
/* compiled from: PG */
public abstract class qq extends DialogFragment implements DialogInterface.OnClickListener {
    private DialogPreference a;
    private CharSequence b;
    private CharSequence c;
    public int d;
    private CharSequence e;
    private CharSequence f;
    private int g;
    private BitmapDrawable h;

    /* access modifiers changed from: protected */
    @Deprecated
    public void a(AlertDialog.Builder builder) {
    }

    @Deprecated
    public abstract void a(boolean z);

    /* access modifiers changed from: protected */
    public boolean a() {
        return false;
    }

    @Deprecated
    public final DialogPreference b() {
        if (this.a == null) {
            this.a = (DialogPreference) ((ps) getTargetFragment()).a(getArguments().getString("key"));
        }
        return this.a;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void a(View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.f;
            int i = 0;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else if (findViewById instanceof TextView) {
                ((TextView) findViewById).setText(charSequence);
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    @Deprecated
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.d = i;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof ps) {
            ps psVar = (ps) targetFragment;
            String string = getArguments().getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) psVar.a(string);
                this.a = dialogPreference;
                this.b = dialogPreference.a;
                this.c = dialogPreference.d;
                this.e = dialogPreference.e;
                this.f = dialogPreference.b;
                this.g = dialogPreference.f;
                Drawable drawable = dialogPreference.c;
                if (drawable == null || (drawable instanceof BitmapDrawable)) {
                    this.h = (BitmapDrawable) drawable;
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                this.h = new BitmapDrawable(getResources(), createBitmap);
                return;
            }
            this.b = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.c = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.e = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.g = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.h = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        this.d = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle(this.b).setIcon(this.h).setPositiveButton(this.c, this).setNegativeButton(this.e, this);
        int i = this.g;
        View view = null;
        if (i != 0) {
            view = LayoutInflater.from(activity).inflate(i, (ViewGroup) null);
        }
        if (view == null) {
            negativeButton.setMessage(this.f);
        } else {
            a(view);
            negativeButton.setView(view);
        }
        a(negativeButton);
        AlertDialog create = negativeButton.create();
        if (a()) {
            create.getWindow().setSoftInputMode(5);
        }
        return create;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        boolean z;
        super.onDismiss(dialogInterface);
        if (this.d == -1) {
            z = true;
        } else {
            z = false;
        }
        a(z);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.b);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.c);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.e);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f);
        bundle.putInt("PreferenceDialogFragment.layout", this.g);
        BitmapDrawable bitmapDrawable = this.h;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
