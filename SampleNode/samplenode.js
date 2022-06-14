const randomNumber = Math.floor(Math.random()* 100);
const lastNumber = randomNumber +9;

const generateSequence = () => {
    const sequence = [];
    const randomIndex = ~~(Math.random() * 10);

    for (let i = randomNumber; i <= lastNumber; i++) {
         sequence.push(i);
        
    }

    sequence.splice(randomIndex, 1);

    //shuffle array and return
    return sequence.sort((a,b) => 0.5 - Math.random());
};

const sequence = generateSequence();

const findMissingNumber = () => {
    if(!sequence.includes(randomNumber)) {
      return randomNumber;  
    } else if(!sequence.includes(lastNumber)) {
      return lastNumber;
    } else {
        const sortedSequence = sequence.sort((a,b) => a-b);
        for(let i = randomNumber; i <= lastNumber; i++) {
            if(!sortedSequence.includes(i)) {
                return i;
            }
        }
    }
    
};

const result = findMissingNumber(sequence);
console.log("sequence:-", sequence);
console.log("missing Number:-",result);