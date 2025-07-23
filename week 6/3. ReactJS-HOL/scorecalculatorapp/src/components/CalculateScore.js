import '../Stylesheets/mystyle.css'

const percentToDecimal = (decimal) => {
    return (decimal.toFixed(2) + '%');
}

const calcScore = (total,goal) => {
    return percentToDecimal((total / goal) * 100);
}

export const CalculateScore = ({Name ,SChool, total, goal }) => {
    <div className='fromatstyle'>
        <h1></h1>
}    
