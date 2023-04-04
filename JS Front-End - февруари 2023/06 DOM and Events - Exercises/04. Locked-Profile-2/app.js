function lockedProfile() {

    const buttons = Array.from(document.getElementsByTagName('button'))
    buttons
        .forEach((el) => {
            el.addEventListener('click', toggleInfo)
        })
    function toggleInfo(e) {
        const btn = e.currentTarget
        const currentProfile = btn.parentElement
        const children = Array.from(currentProfile.children)
        const unLockedRadioInput = children[4]
        const additionalDivInfo = children[9]

        if (unLockedRadioInput.checked) {
            if (btn.textContent === 'Show more') {
                additionalDivInfo.style.display = 'block'
                btn.textContent = 'Hide it'
            } else {
                additionalDivInfo.style.display = 'none'
                btn.textContent = 'Show more'
            }
        }
    }
}