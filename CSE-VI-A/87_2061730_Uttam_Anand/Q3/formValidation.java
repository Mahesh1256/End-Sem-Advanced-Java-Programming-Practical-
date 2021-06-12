public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
    ActionErrors errors = new ActionErrors();
    if (userName == null || userName.length() < 1) {
        errors.add("userName", new ActionMessage("error.userName.required"));
    }
    if (password == null || password.length() < 1) {
        errors.add("password", new ActionMessage("error.password.required"));
    }
    // Uttam Anand
    return errors;
}